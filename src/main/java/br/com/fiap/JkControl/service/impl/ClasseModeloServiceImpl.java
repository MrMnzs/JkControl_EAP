package br.com.fiap.JkControl.service.impl;

import br.com.fiap.JkControl.dao.impl.CondominioDAOImpl;
import br.com.fiap.JkControl.entity.Condominio;
import br.com.fiap.JkControl.service.GenericService;

import java.util.List;

public class ClasseModeloServiceImpl extends GenericService<Condominio, Long> {

    private static ClasseModeloServiceImpl instance = null;

    private CondominioDAOImpl classeModeloDAO;

    public static ClasseModeloServiceImpl getInstance(){
        if(instance == null){
            instance = new ClasseModeloServiceImpl();
        }
        return instance;
    }


    private ClasseModeloServiceImpl(){
        this.classeModeloDAO = classeModeloDAO;
    }


    @Override
    public void inserir(Condominio instance) {
        try {

        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }
    @Override
    public void atualizar(Condominio instance) {
        try {

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

        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }

    @Override
    public Condominio obter(Long id) {
        //TODO fazer direitinho
        try {

        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
        return null;
    }

    @Override
    public List<Condominio> listar() {
        //TODO fazer direitinho
        try {

        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
        return null;
    }
}
