package br.com.api.elatrampa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.elatrampa.dto.PessoasDTO;
import br.com.api.elatrampa.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoasController {

	@Autowired
	private PessoaService service;
	
	@GetMapping(value = "/{Id}")
	public PessoasDTO findById(@PathVariable Long pessoaId) {
		return service.findById(pessoaId);
	}
	
}
