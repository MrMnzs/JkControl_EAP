package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.Condominio;

public class CondominioDAOImpl extends HibernateGenericDAO<Condominio, Long> {

    private static CondominioDAOImpl instance = null;

    public static CondominioDAOImpl getInstance() {
        if (instance == null){
            instance = new CondominioDAOImpl();
        }
        return instance;
    }


    public CondominioDAOImpl() {
        super(Condominio.class);
    }


}
