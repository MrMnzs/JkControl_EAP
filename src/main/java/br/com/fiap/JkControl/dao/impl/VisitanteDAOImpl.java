package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.Visitante;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class VisitanteDAOImpl extends HibernateGenericDAO<Visitante, Long> {

    private static VisitanteDAOImpl instance;

    public static VisitanteDAOImpl getInstance(){
        if(instance == null){
            instance = new VisitanteDAOImpl();
        }
        return instance;
    }

    public VisitanteDAOImpl() {
        super(Visitante.class);
    }

    public List<Visitante> listarPorNomeLike(String nome, EntityManager entityManager) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Visitante> criteriaQuery = builder.createQuery(Visitante.class);

        Root<Visitante> visitanteRoot = criteriaQuery.from(Visitante.class);

        Predicate predicate = builder.like(
                builder.upper(visitanteRoot.get("nome")), nome + "%");

        criteriaQuery.select(visitanteRoot);
        criteriaQuery.where(predicate);

        TypedQuery<Visitante> consulta = entityManager.createQuery(criteriaQuery);

        return consulta.getResultList();
    }

    public List<Visitante> listarCpfEqual(String cpf, EntityManager entityManager) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Visitante> criteriaQuery = builder.createQuery(Visitante.class);

        Root<Visitante> visitanteRoot = criteriaQuery.from(Visitante.class);

        Predicate predicate = builder.equal(visitanteRoot.get("cpf"), cpf);

        criteriaQuery.select(visitanteRoot);
        criteriaQuery.where(predicate);

        TypedQuery<Visitante> consulta = entityManager.createQuery(criteriaQuery);

        return consulta.getResultList();
    }

    public List<Visitante> listarDataCadastroMaior(LocalDateTime dataCadastro, EntityManager entityManager) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<br.com.fiap.JkControl.entity.Visitante> criteriaQuery = builder.createQuery(br.com.fiap.JkControl.entity.Visitante.class);

        Root<br.com.fiap.JkControl.entity.Visitante> visitanteRoot = criteriaQuery.from(br.com.fiap.JkControl.entity.Visitante.class);

        Predicate predicate = builder.greaterThanOrEqualTo(visitanteRoot.get("dataCadastro"), dataCadastro);

        criteriaQuery.select(visitanteRoot);
        criteriaQuery.where(predicate);

        TypedQuery<br.com.fiap.JkControl.entity.Visitante> consulta = entityManager.createQuery(criteriaQuery);

        return consulta.getResultList();
    }

}
