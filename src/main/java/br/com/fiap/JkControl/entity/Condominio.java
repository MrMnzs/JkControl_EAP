package br.com.fiap.JkControl.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCO_CONDOMINIO")
@SequenceGenerator(name = "condominio", sequenceName = "SQ_T_GCO_CONDOMINIO", allocationSize = 1)
public class Condominio implements Serializable {

    private static final long serialVersionUID = -1982899238988341714L;
    @Id
    @GeneratedValue(generator = "condominio", strategy = GenerationType.SEQUENCE)
    private Long id;

    //TODO alterar atributos de acordo com o que o professor passar

    //Copiar e colar esse atributo com essa tag para facilitar
    @Column(name = "ds_razao_social")
    private String razaoSocial;


    @Column(name = "nm_fantasia")
    private String nomeFantasia;


    @Column(name = "dt_fundacao")
    private LocalDate dataFundacao;







    //TODO método toString personalizado
}
