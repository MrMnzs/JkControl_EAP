package br.com.fiap.JkControl.service.impl;

import br.com.fiap.JkControl.dao.impl.CondominioDAOImpl;
import br.com.fiap.JkControl.dao.impl.FuncionarioPortariaDAOImpl;
import br.com.fiap.JkControl.entity.Condominio;
import br.com.fiap.JkControl.entity.FuncionarioPortaria;
import br.com.fiap.JkControl.service.GenericService;

import java.util.List;

public class FuncionarioPortariaServiceImpl extends GenericService<FuncionarioPortaria, Long> {

    private static FuncionarioPortariaServiceImpl instance = null;

    private FuncionarioPortariaDAOImpl funcionarioPortariaDAO;

    public static FuncionarioPortariaServiceImpl getInstance(){
        if(instance == null){
            instance = new FuncionarioPortariaServiceImpl();
        }
        return instance;
    }


    private FuncionarioPortariaServiceImpl(){
        this.funcionarioPortariaDAO = funcionarioPortariaDAO;
    }


    @Override
    public void inserir(FuncionarioPortaria funcionarioPortaria) {
        try {
            funcionarioPortariaDAO.salvar(funcionarioPortaria, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }
    @Override
    public void atualizar(FuncionarioPortaria funcionarioPortaria) {
        try {
            funcionarioPortariaDAO.atualizar(funcionarioPortaria, getEntityManager());
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
            funcionarioPortariaDAO.remover(id, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }

    @Override
    public FuncionarioPortaria obter(Long id) {
        //TODO fazer direitinho
        FuncionarioPortaria funcionarioPortaria = null;
        try {
            funcionarioPortaria = funcionarioPortariaDAO.obterPorId(id, getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
        return funcionarioPortaria;
    }

    @Override
    public List<FuncionarioPortaria> listar() {
        //TODO fazer direitinho
        List<FuncionarioPortaria> funcionariosPortaria = null;
        try {
            funcionariosPortaria = funcionarioPortariaDAO.listar(getEntityManager());
        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
        return funcionariosPortaria;
    }
}
