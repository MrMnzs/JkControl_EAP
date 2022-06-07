package br.com.fiap.JkControl.entity;

import javax.persistence.*;

@Entity
@SequenceGenerator(name = "", sequenceName = "SQ_TB_", allocationSize = 1)
public class ClasseModelo {

    @Id
    @GeneratedValue(generator = "", strategy = GenerationType.SEQUENCE)
    private Long id;

    //TODO alterar atributos de acordo com o que o professor passar

    //Copiar e colar esse atributo com essa tag para facilitar
    @Column(name = "")
    private String TROCARNOME;




    //TODO método toString personalizado
}
