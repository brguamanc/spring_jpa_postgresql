package com.byron.screenmatch;

import com.byron.screenmatch.model.DatosEpisodio;
import com.byron.screenmatch.model.DatosSerie;
import com.byron.screenmatch.model.DatosTemporadas;
import com.byron.screenmatch.principal.Principal;
import com.byron.screenmatch.service.ConsumoAPI;
import com.byron.screenmatch.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.muestraElMenu();
	}

}
