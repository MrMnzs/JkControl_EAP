package br.com.fiap.JkControl.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "T_GCO_CONDOMINIO")
@SequenceGenerator(name = "condominio", sequenceName = "SQ_T_GCO_CONDOMINIO", allocationSize = 1)
public class Condominio implements Serializable {

    public Condominio() {
    }

    public Condominio(String cnpj, String razaoSocial, String nomeFantasia, LocalDate dataFundacao) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.dataFundacao = dataFundacao;
    }

    private static final long serialVersionUID = -1982899238988341714L;
    @Id
    @GeneratedValue(generator = "condominio", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_condominio")
    private Long id;

    @Column(name = "nr_cnpj")
    private String cnpj;

    @Column(name = "ds_razao_social")
    private String razaoSocial;


    @Column(name = "nm_fantasia")
    private String nomeFantasia;


    @Column(name = "dt_fundacao")
    private LocalDate dataFundacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    //TODO método toString personalizado
}
