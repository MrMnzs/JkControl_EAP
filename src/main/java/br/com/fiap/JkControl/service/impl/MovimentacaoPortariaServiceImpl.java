package br.com.fiap.JkControl.service.impl;



import br.com.fiap.JkControl.dao.impl.MovimentacaoDAOImpl;
import br.com.fiap.JkControl.entity.MovimentacaoPortaria;
import br.com.fiap.JkControl.service.GenericService;

import java.util.List;

public class MovimentacaoPortariaServiceImpl extends GenericService<MovimentacaoPortaria, Long> {

    private static MovimentacaoPortariaServiceImpl instance = null;

    private MovimentacaoDAOImpl movimentacaoDAO;

    public static MovimentacaoPortariaServiceImpl getInstance(){
        if(instance == null){
            instance = new MovimentacaoPortariaServiceImpl();
        }
        return instance;
    }


    private MovimentacaoPortariaServiceImpl(){
        this.movimentacaoDAO = movimentacaoDAO;
    }


    @Override
    public void inserir(MovimentacaoPortaria movimentacaoPortaria) {
        try {
            movimentacaoDAO.salvar(movimentacaoPortaria, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }
    @Override
    public void atualizar(MovimentacaoPortaria movimentacaoPortaria) {
        try {
            movimentacaoDAO.atualizar(movimentacaoPortaria, getEntityManager());
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
            movimentacaoDAO.remover(id, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }

    @Override
    public MovimentacaoPortaria obter(Long id) {

        MovimentacaoPortaria movimentacaoPortaria = null;
        try {
            movimentacaoPortaria = movimentacaoDAO.obterPorId(id, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
        return movimentacaoPortaria;
    }

    @Override
    public List<MovimentacaoPortaria> listar() {

        List<MovimentacaoPortaria> movimentacaoPortarias = null;
        try {
            movimentacaoPortarias = movimentacaoDAO.listar(getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
        return movimentacaoPortarias;
    }




}
