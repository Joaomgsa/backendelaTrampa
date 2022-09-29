package br.com.api.elatrampa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.elatrampa.dto.VagasDTO;
import br.com.api.elatrampa.services.VagasService;

@RestController
@RequestMapping(value = "/vagas")
public class VagasController {

	@Autowired
	private VagasService service;
	
	@GetMapping(value = "/{id}")
	public VagasDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
