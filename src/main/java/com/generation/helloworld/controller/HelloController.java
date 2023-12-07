package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping
	public String hello() {
		return ("<b>Hello Turma 68 !! </b>"
				+ "<hr/>"
				+ "<br><a href=/bsm> Link do BSM's </a>"
				+ "<br><a href=/semana> Objetivos da semana </a>");
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return (
				" <ul><b> BSM's da Generation Brasil </b></ul>"
				+ "<li>Persistência</li>"
				+ "<li>Mentalidade de Crescimento</li>"
				+ "<li>Responsabilidade Pessoal</li>"
				+ "<li>Orientação ao Futuro</li>"
				+ "<li>Orientação ao Detalhe </li>"
				+ "<li>Trabalho em Equipe</li>"
				+ "<li>Comunicação</li>"
				+ "<li>Proatividade</li>"
				+ "<hr/>"
				+ "<br><a href=/> Voltar </a>"
				+ "<br><a href=/semana> Objetivos da semana </a>");
	}
	
	@GetMapping("/semana")
	public String semana() {
		return (
				" <ul><b>Objetivos de aprendizagem desta semana </b></ul>"
				+ "<li>Persistência</li>"
				+ "<li>Spring</li>"
				+ "<li>Insomnia</li>"
				+ "<li>Reler o conteúdo da semana</li>"
				+ "<li>Ajudar mais meus colegas no projeto integrador </li>"
				+ "<li>Rever sobre o DER</li>"
				+ "<li>Proatividade</li>"
				+ "<hr/>"
				+ "<br><a href=/> Voltar BSM's </a>"
				+ "<br><a href=/semana> Início </a>");
	}
}
