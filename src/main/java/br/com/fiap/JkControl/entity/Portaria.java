package br.com.fiap.JkControl.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Entity
@Table(name="t_gco_portaira")
@SequenceGenerator(name="portaria", sequenceName = "sq_t_gco_portaira", allocationSize = 1)
public class Portaria implements Serializable {

    private static final long serialVersionUID = 8650606025898173596L;

    public Portaria() {
    }

    public Portaria(Condominio condominio, int numeroPortaria, String nomePortaria, Boolean statusPortaria, LocalDateTime dataInicio, LocalDateTime dataTermino) {
        this.condominio = condominio;
        this.numeroPortaria = numeroPortaria;
        this.nomePortaria = nomePortaria;
        this.statusPortaria = statusPortaria;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    @Id
    @Column(name="id_portaria")
    @GeneratedValue(generator = "portaria", strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_condominio")
    private Condominio condominio;
    @Column(name="nr_portaria", nullable = false)
    private int numeroPortaria;
    @Column(name="nm_portaria", length = 40, nullable = false)
    private String nomePortaria;
    @Column(name="st_status")
    private Boolean statusPortaria;
    @Column(name="dt_inicio", nullable = false)
    private LocalDateTime dataInicio;
    @Column(name="dt_termino", nullable = false)
    private LocalDateTime dataTermino;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public int getNumeroPortaria() {
        return numeroPortaria;
    }

    public void setNumeroPortaria(int numeroPortaria) {
        this.numeroPortaria = numeroPortaria;
    }

    public String getNomePortaria() {
        return nomePortaria;
    }

    public void setNomePortaria(String nomePortaria) {
        this.nomePortaria = nomePortaria;
    }

    public Boolean getStatusPortaria() {
        return statusPortaria;
    }

    public void setStatusPortaria(Boolean statusPortaria) {
        this.statusPortaria = statusPortaria;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDateTime dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return "\nCondominio: " + this.getCondominio().getClass().getName()
                + "\nPortaria: " + this.getNomePortaria()
                + "\nNúmero: " + this.getNumeroPortaria()
                + "\nData de Início: " + this.getDataInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
                + "\nData de Término: " + this.getDataTermino().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
