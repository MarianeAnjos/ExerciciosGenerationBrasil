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
		return "\n 1. Reforço da lignuaguem Java basica;"
				+ "\n 2. Reforço da linguaguem Java intermediaria;"
				+ "\n 3. Reforço da linguaguem Java avançada;"
				+"\n 4. Revisão de banco de dados.";
	}
}
