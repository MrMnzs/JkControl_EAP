package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.Visitante;

public class VisitanteDAOImpl extends HibernateGenericDAO<Visitante, Long> {

    private static VisitanteDAOImpl instance;

    public static VisitanteDAOImpl getInstance(){
        if(instance == null){
            instance = new VisitanteDAOImpl();
        }
        return instance;
    }

    public VisitanteDAOImpl() {
        super(Visitante.class);
    }
}
