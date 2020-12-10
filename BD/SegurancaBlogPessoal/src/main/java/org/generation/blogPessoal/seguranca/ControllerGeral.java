//localhost:8081 <- direciona para index

package org.generation.blogPessoal.seguranca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Tema;
import com.example.demo.TemaRepository;

@Controller
public class ControllerGeral {
	
	@Autowired
	private TemaRepository repository;
	
	@GetMapping(value= "/")
	public String login() {
		return "index";
	}	
	@GetMapping(value="/cadastrarTema")
	public String form(){
		return "formTema";
	}	
	
	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema){			
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
}