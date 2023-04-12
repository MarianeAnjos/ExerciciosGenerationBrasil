package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Indica para o spring que o código abaixo vai ser um Controller ou um controlador da API
@RestController
//Indicador de EndPoint 
@RequestMapping("/hello")

public class HelloController {

	@GetMapping 
	public String hello() {
		return "Hello World";
	}
	
	//sub rota 
	@GetMapping ("/bsm")
	public String bsm() {
		return "A BSM que eu quero desenvolver nesta semana é: MENTALIDADE DE CRESCIMENTO E PERSISTENCIA";
	}
	
	@GetMapping ("/lista")
	public String lista() {
		return "\n BSMS da Generation Brasil:"
				+ "\n\n 1.Mentalidade de Crescimento;"
				+ "\n 2.Persistencia;"
				+ "\n 3.Orientação ao futuro;"
				+"\n 4.Responsabilidade Pessoal;"
				+"\n 5.Comunicação;"
				+"\n 6.Orientação ao detalhe;"
				+"\n 7.Proatividade;"
				+"\n 8.Trabalho em equipe.";
	}
}
