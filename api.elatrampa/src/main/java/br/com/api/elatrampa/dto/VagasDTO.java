package br.com.api.elatrampa.dto;

import br.com.api.elatrampa.data.model.Vagas;

public class VagasDTO {
	
	private Long id;
	private String tituloVaga;
	private String descricaoVaga;		
	private String localizacaoVaga;
	private Integer experienciaVaga;

	
	public VagasDTO() {
		
	}


	public VagasDTO(Long id, String tituloVaga, String descricaoVaga, String localizacaoVaga, Integer experienciaVaga) {
		
		this.id = id;
		this.tituloVaga = tituloVaga;
		this.descricaoVaga = descricaoVaga;
		this.localizacaoVaga = localizacaoVaga;
		this.experienciaVaga = experienciaVaga;
	}
	
	public VagasDTO(Vagas vaga) {
		
		id = vaga.getId();
		tituloVaga = vaga.getTituloVaga();
		descricaoVaga = vaga.getDescricaoVaga();
		localizacaoVaga = vaga.getLocalizacaoVaga();
		experienciaVaga = vaga.getExperienciaVaga();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTituloVaga() {
		return tituloVaga;
	}


	public void setTituloVaga(String tituloVaga) {
		this.tituloVaga = tituloVaga;
	}


	public String getDescricaoVaga() {
		return descricaoVaga;
	}


	public void setDescricaoVaga(String descricaoVaga) {
		this.descricaoVaga = descricaoVaga;
	}


	public String getLocalizacaoVaga() {
		return localizacaoVaga;
	}


	public void setLocalizacaoVaga(String localizacaoVaga) {
		this.localizacaoVaga = localizacaoVaga;
	}


	public Integer getExperienciaVaga() {
		return experienciaVaga;
	}


	public void setExperienciaVaga(Integer experienciaVaga) {
		this.experienciaVaga = experienciaVaga;
	}
	
	
}
