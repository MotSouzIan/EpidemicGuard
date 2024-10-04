package com.example.EpidemicGuard;

import com.example.EpidemicGuard.facade.AdministradorFacade;
import com.example.EpidemicGuard.facade.CidadaoFacade;
import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.entities.Cidadao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class EpidemicGuardApplication {
	public static void main(String[] args) {
		SpringApplication.run(EpidemicGuardApplication.class, args);
	}
}