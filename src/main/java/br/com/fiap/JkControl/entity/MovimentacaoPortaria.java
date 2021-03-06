package br.com.fiap.JkControl.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name="t_gco_movimentacao_portaria")
@SequenceGenerator(name="movimentacao_portaria", sequenceName = "sq_t_gco_movimentacao_portaria", allocationSize = 1)
@NamedQueries({
        @NamedQuery(name = "MovimentacaoPortaria.listarPorTipo",
                query = "SELECT m FROM MovimentacaoPortaria m WHERE m.tipoMovimentacao = :tipoMovimentacao")
})
public class MovimentacaoPortaria implements Serializable {


    private static final long serialVersionUID = 4067635168276167148L;

    public MovimentacaoPortaria() {

    }

    public MovimentacaoPortaria(Portaria portaria, FuncionarioPortaria funcionarioPortaria, Visitante visitante, String tipoMovimentacao, LocalDateTime dataMovimentacao) {
        this.portaria = portaria;
        this.funcionarioPortaria = funcionarioPortaria;
        this.visitante = visitante;
        this.tipoMovimentacao = tipoMovimentacao;
        this.dataMovimentacao = dataMovimentacao;
    }

    @Id
    @Column(name="id_movimentacao")
    @GeneratedValue(generator = "movimentacao_portaria", strategy = GenerationType.SEQUENCE)
    private Long id;


    @ManyToOne
    @JoinColumn(name="id_portaria")
    private Portaria portaria;

    @ManyToOne
    @JoinColumn(name="id_func_portaria")
    private FuncionarioPortaria funcionarioPortaria;

    @ManyToOne
    @JoinColumn(name="id_visitante")
    private Visitante visitante;

    @Column(name="tp_movimentacao", length = 20, nullable = false)
    private String tipoMovimentacao;

    @Column(name="dt_movimentacao", nullable = false)
    private LocalDateTime dataMovimentacao;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Portaria getPortaria() {
        return portaria;
    }

    public void setPortaria(Portaria portaria) {
        this.portaria = portaria;
    }

    public FuncionarioPortaria getFuncionarioPortaria() {
        return funcionarioPortaria;
    }

    public void setFuncionarioPortaria(FuncionarioPortaria funcionarioPortaria) {
        this.funcionarioPortaria = funcionarioPortaria;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public LocalDateTime getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    @Override
    public String toString() {
        return "\nNome Visitante: " + this.getVisitante().getClass().getName()
                + "\nPortaria: " + this.getPortaria().getClass().getName()
                + "\nTipo: " + this.getTipoMovimentacao()
                + "\nFuncionario na portaria: " + this.getFuncionarioPortaria().getNome()
                + "\nData de In??cio: " + this.getDataMovimentacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
