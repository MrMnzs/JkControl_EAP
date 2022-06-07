package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.Portaria;

public class PortariaDAOImpl extends HibernateGenericDAO<Portaria, Long> {

    private static PortariaDAOImpl instance = null;


    public static PortariaDAOImpl getInstance(){
        if(instance == null){
            instance = new PortariaDAOImpl();
        }
        return instance;
    }

    public PortariaDAOImpl() {
        super(Portaria.class);
    }
}
