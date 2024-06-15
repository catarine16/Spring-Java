package br.edu.eteczl.catracabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CatracabackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatracabackendApplication.class, args);
	}

	@GetMapping("/RegistroAluno/{number}")
	public String obterRA(@PathVariable String number) {
		if (number.equals("24461")) {
			 return "RM DA CATARINE: 24461";
		} else if (number.equals("24243")) {
			return "RM DO PEDRO: 24243";
		} else {
			return "mano esse RM nem tá aqui";
		}
	}
}
