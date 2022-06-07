package br.com.fiap.JkControl.dao.impl;

import br.com.fiap.JkControl.dao.HibernateGenericDAO;
import br.com.fiap.JkControl.entity.ClasseModelo;

public class ClasseModeloDAO extends HibernateGenericDAO<ClasseModelo, Long> {


    public ClasseModeloDAO() {
        super(ClasseModelo.class);
    }
}
