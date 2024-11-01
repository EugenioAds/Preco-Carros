package br.com.eugenio.PrecoCarros;

import br.com.eugenio.PrecoCarros.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrecoCarrosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PrecoCarrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws InterruptedException {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
