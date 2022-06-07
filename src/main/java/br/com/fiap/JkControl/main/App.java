package br.com.fiap.JkControl.main;

import br.com.fiap.JkControl.entity.Condominio;
import br.com.fiap.JkControl.service.impl.CondominioServiceImpl;

public class App {

	public static void main(String[] args) {
		CondominioServiceImpl condominioService = CondominioServiceImpl.getInstance();

		Condominio condominio = new Condominio();

		condominioService.inserir();
		
	}
}
