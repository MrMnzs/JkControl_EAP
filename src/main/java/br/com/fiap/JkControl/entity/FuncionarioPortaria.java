package br.com.fiap.JkControl.entity;

import org.hibernate.type.descriptor.java.LocalDateJavaDescriptor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "T_GCO_FUNC_PORTARIA")
@SequenceGenerator(name = "funcionarioPortaria", sequenceName = "SQ_T_GCO_FUNC_PORTARIA", allocationSize = 1)
public class FuncionarioPortaria implements Serializable {

    @Id
    @GeneratedValue(generator = "funcionarioPortaria")
    @Column(name = "id_func_portaria")
    private Long id;

    @Column(name = "nm_funcionario")
    private String nome;

    @Column(name = "dt_nasc")
    private LocalDate dataNascimento;

    @Column(name = "nr_cpf")
    private String cpf;

    @Column(name = "nr_rg")
    private String rg;

    @Column(name = "dt_cadastro")
    private LocalDateTime dataCadastro;

    public FuncionarioPortaria() {
    }

    public FuncionarioPortaria(String nome, LocalDate dataNascimento, String cpf, String rg) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
