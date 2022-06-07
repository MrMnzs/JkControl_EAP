package br.com.fiap.JkControl.service.impl;

import br.com.fiap.JkControl.dao.impl.ClasseModeloDAOImpl;
import br.com.fiap.JkControl.entity.ClasseModelo;
import br.com.fiap.JkControl.service.GenericService;

import java.util.List;

public class ClasseModeloServiceImpl extends GenericService<ClasseModelo, Long> {

    private static ClasseModeloServiceImpl instance = null;

    private ClasseModeloDAOImpl classeModeloDAO;

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
    public void inserir(ClasseModelo instance) {
        try {

        }catch (Exception e){
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        }finally {
            closeEntityManager();
        }
    }
    @Override
    public void atualizar(ClasseModelo instance) {
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
    public ClasseModelo obter(Long id) {
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
    public List<ClasseModelo> listar() {
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
