package com.example.EpidemicGuard;

import com.example.EpidemicGuard.facade.AdministradorFacade;
import com.example.EpidemicGuard.facade.CidadaoFacade;
import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.entities.Cidadao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class EpidemicGuardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EpidemicGuardApplication.class, args);

		// Exemplo de uso da fachada de Administrador
		AdministradorFacade administradorFacade = new AdministradorFacade();
		administradorFacade.salvar(1, "João", "senha123", "123.456.789-00");
		Administrador admin = administradorFacade.buscarPorId(1);
		System.out.println("Administrador: " + admin.getNome());

		// Exemplo de uso da fachada de Cidadao
		CidadaoFacade cidadaoFacade = new CidadaoFacade();
		cidadaoFacade.salvar(1, "Maria", "987.654.321-00", new Date(), "Feminino", "senha123");
		Cidadao cidadao = cidadaoFacade.buscarPorId(1);
		System.out.println("Cidadão: " + cidadao.getNome());
	}
}
