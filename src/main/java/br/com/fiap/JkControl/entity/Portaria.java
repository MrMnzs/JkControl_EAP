package br.com.fiap.JkControl.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Portaria implements Serializable {

    private Long id;

    private Condominio condominio;

    private String numeroPortaria;

    private String nomePortaria;

    private Boolean statusPortaria;

    private LocalDateTime dataInicio;

    private LocalDateTime dataTermino;

}
