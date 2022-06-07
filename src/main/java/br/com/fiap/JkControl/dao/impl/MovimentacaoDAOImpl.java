package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.MovimentacaoPortaria;

public class MovimentacaoDAOImpl extends HibernateGenericDAO<MovimentacaoPortaria, Long> {

    private static MovimentacaoDAOImpl instance;

    public static MovimentacaoDAOImpl getInstance(){
        if(instance == null){
            instance = new MovimentacaoDAOImpl();
        }
        return instance;
    }

    public MovimentacaoDAOImpl() {
        super(MovimentacaoPortaria.class);
    }
}
