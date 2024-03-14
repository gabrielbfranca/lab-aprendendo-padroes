package com.diopratica.padraoprojetopratica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PadraoProjetoPraticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProjetoPraticaApplication.class, args);
	}

}
