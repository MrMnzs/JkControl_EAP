package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.ClasseModelo;

public class ClasseModeloDAO extends HibernateGenericDAO<ClasseModelo, Long> {

    private static ClasseModeloDAO instance = null;

    public static ClasseModeloDAO getInstance() {
        if (instance == null){
            instance = new ClasseModeloDAO();
        }
        return instance;
    }


    public ClasseModeloDAO() {
        super(ClasseModelo.class);
    }

    //TODO queries necessárias
}
