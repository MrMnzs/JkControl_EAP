package br.com.fiap.JkControl.service.impl;

import br.com.fiap.JkControl.dao.impl.VisitanteDAOImpl;
import br.com.fiap.JkControl.entity.Visitante;
import br.com.fiap.JkControl.service.GenericService;

import java.util.List;

public class VisitanteServiceImpl extends GenericService<Visitante, Long> {

    private static VisitanteServiceImpl instance = null;

    private VisitanteDAOImpl visitanteDAO;

    public static VisitanteServiceImpl getInstance(){
        if(instance == null){
            instance = new VisitanteServiceImpl();
        }
        return instance;
    }


    private VisitanteServiceImpl(){
        this.visitanteDAO = VisitanteDAOImpl.getInstance();
    }


    @Override
    public void inserir(Visitante visitante) {
        try {
            visitanteDAO.salvar(visitante, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }
    @Override
    public void atualizar(Visitante visitante) {
        try {
            visitanteDAO.atualizar(visitante, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }

    @Override
    public void remover(Long id) {
        try {
            visitanteDAO.remover(id, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }

    @Override
    public Visitante obter(Long id) {
        Visitante visitante = null;
        try {
            visitante = visitanteDAO.obterPorId(id, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
        return visitante;
    }

    @Override
    public List<Visitante> listar() {
        List<Visitante> visitantes = null;
        try {
            visitantes = visitanteDAO.listar(getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
        return visitantes;
    }
}
