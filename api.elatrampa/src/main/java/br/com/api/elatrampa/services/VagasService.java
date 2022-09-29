package br.com.api.elatrampa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.elatrampa.data.model.Vagas;
import br.com.api.elatrampa.dto.VagasDTO;
import br.com.api.elatrampa.repository.VagasRepository;

@Service
public class VagasService {
	
	@Autowired
	private VagasRepository repository;
	
	public VagasDTO findById(Long id) {
		Vagas entity = repository.findById(id).get();
		VagasDTO dto = new VagasDTO(entity);
		return dto;
		
	}

}
