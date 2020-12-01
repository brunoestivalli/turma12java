package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.Optional;

//é uma api rest que será consumida pelo front
//WebMvcConfigurer é que faz o roteamento
@RestController
@RequestMapping("/pagina") // esta é uma notação para o Angular fazer leitura
public class Controller implements WebMvcConfigurer {

	// quando o usuario digitar localhost:8080 o sistema le como localhost:8080/
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}

	// ele vai conectar com a tabela manutencao, ou seja, qdo vamos fazer o
	// controler
	// ele vai conectar com a tabela manutencao, ou seja, qdo vamos fazer o
	// controler, precisamos
	// injetar o caminhao que vai levar os dados ate a tabela
	// @autowired injecao e repository é o caminhao que leva os dados na tabela
	@Autowired
	private ManutencaoRepository repository;

	// este metodo criar vai salvar as informacoes la no banco
	// insert ---------localhost:8080/pagina/manutencoes
	@PostMapping("/manutencoes")
	public ManutencaoTable criar(@RequestBody ManutencaoTable objetinho) {
		repository.save(objetinho);
		return objetinho;
	}

	@GetMapping("/manutencoes/{id}")
	public Optional<ManutencaoTable> buscarUm(@PathVariable Long id) {
		return repository.findById(id);
	}

	@GetMapping("/manutencoes")
	public List<ManutencaoTable> pesquisarTodos() {
		return repository.findAll();
	}

}
