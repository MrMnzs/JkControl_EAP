package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.ClasseModelo;

public class ClasseModeloDAOImpl extends HibernateGenericDAO<ClasseModelo, Long> {

    private static ClasseModeloDAOImpl instance = null;

    public static ClasseModeloDAOImpl getInstance() {
        if (instance == null){
            instance = new ClasseModeloDAOImpl();
        }
        return instance;
    }


    public ClasseModeloDAOImpl() {
        super(ClasseModelo.class);
    }

    //TODO queries necessárias
}
