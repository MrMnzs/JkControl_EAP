package br.com.fiap.JkControl.main;

import br.com.fiap.JkControl.entity.*;
import br.com.fiap.JkControl.service.impl.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {

	public static void main(String[] args) {
		CondominioServiceImpl condominioService = CondominioServiceImpl.getInstance();
		PortariaServiceImpl portariaSerivce = PortariaServiceImpl.getInstance();
		MovimentacaoPortariaServiceImpl movimentacaoPortariaService = MovimentacaoPortariaServiceImpl.getInstance();
		FuncionarioPortariaServiceImpl funcionarioPortariaService = FuncionarioPortariaServiceImpl.getInstance();
		VisitanteServiceImpl visitanteService = VisitanteServiceImpl.getInstance();


		Condominio condominio = new Condominio("01.123.321/0001-55", "Edificações residenciais LTDA", "Vila dos milionarios", LocalDate.of(2022, 5, 6));

		condominioService.inserir(condominio);
		condominioService.listar().forEach(System.out::println);



		Portaria portariaPrincipal = new Portaria(condominio, 1, "Principal", true, LocalDateTime.now(), LocalDateTime.now());
		Portaria portariaServico = new Portaria(condominio, 2, "Servico", true, LocalDateTime.now(), LocalDateTime.now());


		portariaSerivce.inserir(portariaPrincipal);
		portariaSerivce.inserir(portariaServico);


		Visitante visitante1 = visitanteService.obter(1l);
		Visitante visitante2 = visitanteService.obter(2l);

		FuncionarioPortaria func1 = funcionarioPortariaService.obter(1l);
		FuncionarioPortaria func2 = funcionarioPortariaService.obter(2l);

		MovimentacaoPortaria movimentacaoPortaria1 = new MovimentacaoPortaria(portariaPrincipal, func1, visitante1, "Tipo E", LocalDateTime.of(LocalDate.of(2022, 6, 1), LocalTime.of(15, 0, 0)));
		MovimentacaoPortaria movimentacaoPortaria2 = new MovimentacaoPortaria(portariaPrincipal, func1, visitante1, "Tipo E", LocalDateTime.of(LocalDate.of(2022, 6, 1), LocalTime.of(15, 30, 0)));
		MovimentacaoPortaria movimentacaoPortaria3 = new MovimentacaoPortaria(portariaPrincipal, func2, visitante2, "Tipo S", LocalDateTime.of(LocalDate.of(2022, 6, 1), LocalTime.of(15, 45, 0)));

		movimentacaoPortariaService.inserir(movimentacaoPortaria1);
		movimentacaoPortariaService.inserir(movimentacaoPortaria2);
		movimentacaoPortariaService.inserir(movimentacaoPortaria3);

		movimentacaoPortariaService.listarPorTipo("Tipo E").forEach(System.out::println);

		
	}
}
