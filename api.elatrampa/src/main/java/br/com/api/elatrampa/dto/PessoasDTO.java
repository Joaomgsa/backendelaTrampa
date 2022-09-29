package br.com.api.elatrampa.dto;

import br.com.api.elatrampa.data.model.Pessoas;

public class PessoasDTO {
	
	private Long pessoaId;
	private String nomePessoa;
	private String profissaoPessoa;
	private String localizacaoPessoa;
	private String nivelExperienciaPessoa;
	
	public PessoasDTO() {
		
	}

	public PessoasDTO(Long pessoaId, String nomePessoa, String profissaoPessoa, String localizacaoPessoa,
			String nivelExperienciaPessoa) {
		this.pessoaId = pessoaId;
		this.nomePessoa = nomePessoa;
		this.profissaoPessoa = profissaoPessoa;
		this.localizacaoPessoa = localizacaoPessoa;
		this.nivelExperienciaPessoa = nivelExperienciaPessoa;
	}
	
	public PessoasDTO(Pessoas pessoa) {
		pessoaId = pessoa.getPessoaId();
		nomePessoa = pessoa.getNomePessoa();
		profissaoPessoa = pessoa.getProfissaoPessoa();
		localizacaoPessoa = pessoa.getLocalizacaoPessoa();
		nivelExperienciaPessoa = pessoa.getNivelExperienciaPessoa();
	}

	public Long getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getProfissaoPessoa() {
		return profissaoPessoa;
	}

	public void setProfissaoPessoa(String profissaoPessoa) {
		this.profissaoPessoa = profissaoPessoa;
	}

	public String getLocalizacaoPessoa() {
		return localizacaoPessoa;
	}

	public void setLocalizacaoPessoa(String localizacaoPessoa) {
		this.localizacaoPessoa = localizacaoPessoa;
	}

	public String getNivelExperienciaPessoa() {
		return nivelExperienciaPessoa;
	}

	public void setNivelExperienciaPessoa(String nivelExperienciaPessoa) {
		this.nivelExperienciaPessoa = nivelExperienciaPessoa;
	}
	
	
	
}
