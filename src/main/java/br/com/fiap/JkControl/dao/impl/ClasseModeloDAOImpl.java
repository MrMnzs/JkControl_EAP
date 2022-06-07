package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.Condominio;

public class ClasseModeloDAOImpl extends HibernateGenericDAO<Condominio, Long> {

    private static ClasseModeloDAOImpl instance = null;

    public static ClasseModeloDAOImpl getInstance() {
        if (instance == null){
            instance = new ClasseModeloDAOImpl();
        }
        return instance;
    }


    public ClasseModeloDAOImpl() {
        super(Condominio.class);
    }

    //TODO queries necessárias
}
