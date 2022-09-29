package br.com.api.elatrampa.data.model;

import java.io.Serializable;
import java.util.Objects;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Candidatura")
public class Candidatura implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="pessoaId",nullable=false)
	private Long pessoaId;
	
	@Column(name="vagaId",nullable=false)
	private Long vagaId;
	
	@Column(name = "active", nullable=false)
	private boolean active;
	
	
	
	public Candidatura() {
		
	}



	public Candidatura(Long id, Long pessoaId, Long vagaId, boolean active) {
		super();
		this.id = id;
		this.pessoaId = pessoaId;
		this.vagaId = vagaId;
		this.active = active;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getPessoaId() {
		return pessoaId;
	}



	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}



	public Long getVagaId() {
		return vagaId;
	}



	public void setVagaId(Long vagaId) {
		this.vagaId = vagaId;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidatura other = (Candidatura) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
	
	
	
}
