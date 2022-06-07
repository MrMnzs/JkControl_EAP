package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.FuncionarioPortaria;

public class FuncionarioPortariaDAOImpl extends HibernateGenericDAO<FuncionarioPortaria, Long> {

    private static FuncionarioPortariaDAOImpl instance = null;

    public static FuncionarioPortariaDAOImpl getInstance(){
        if(instance == null){
            instance = new FuncionarioPortariaDAOImpl();
        }
        return instance;
    }

    public FuncionarioPortariaDAOImpl() {
        super(FuncionarioPortaria.class);
    }
}
