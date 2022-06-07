package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.MovimentacaoPortaria;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class MovimentacaoDAOImpl extends HibernateGenericDAO<MovimentacaoPortaria, Long> {

    private static MovimentacaoDAOImpl instance;

    public static MovimentacaoDAOImpl getInstance(){
        if(instance == null){
            instance = new MovimentacaoDAOImpl();
        }
        return instance;
    }

    public MovimentacaoDAOImpl() {
        super(MovimentacaoPortaria.class);
    }

    public List<MovimentacaoPortaria> listagemPorTipo(String tipo, EntityManager entityManager){
        TypedQuery<MovimentacaoPortaria> consulta = entityManager.createNamedQuery("MovimentacaoPortaria.listarPorTipo", MovimentacaoPortaria.class);
        consulta.setParameter("tipoMovimentacao", tipo);

        return consulta.getResultList();
    }
}
