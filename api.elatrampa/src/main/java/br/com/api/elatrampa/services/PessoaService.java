package br.com.api.elatrampa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.api.elatrampa.data.model.Pessoas;
import br.com.api.elatrampa.dto.PessoasDTO;
import br.com.api.elatrampa.exception.ResourceNotFoundException;
import br.com.api.elatrampa.repository.PessoasRepository;



@Service
public class PessoaService {
	
	@Autowired
	private PessoasRepository repository;
	
	
	
	@Transactional(readOnly = true)
	public PessoasDTO findById(Long pessoaId) {
		Pessoas entity = repository.findById(pessoaId).get();
		PessoasDTO dto = new PessoasDTO(entity);
		return dto;
		
	}
	
	public PessoasDTO update(PessoasDTO pessoa) {
		Pessoas entity = repository.findById(pessoa.getPessoaId())
				.orElseThrow(() -> new ResourceNotFoundException("Pessoa Não Encontrada nesse ID"));
		entity.setNomePessoa(pessoa.getNomePessoa());
		entity.setProfissaoPessoa(pessoa.getProfissaoPessoa());
		entity.setLocalizacaoPessoa(pessoa.getLocalizacaoPessoa());
		entity.setNivelExperienciaPessoa(pessoa.getNivelExperienciaPessoa());
		
		PessoasDTO dto = new PessoasDTO(entity);
		
		return dto;
	}
	
	
	public void delete(Long pessoaId) {
		Pessoas entity = repository.findById(pessoaId)
				.orElseThrow(() -> new ResourceNotFoundException("Pessoa Não Encontrada nesse ID"));
		repository.delete(entity);
	}
	

	
	
}
