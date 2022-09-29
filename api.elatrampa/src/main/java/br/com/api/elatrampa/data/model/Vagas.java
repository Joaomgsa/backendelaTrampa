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
@Table(name="vagas")
public class Vagas implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
	@Column(name = "tituloVaga", nullable=false, length=250)
	private String tituloVaga;
	
	@Column(name = "descricaoVaga", nullable=false, length=250)
	private String descricaoVaga;
	
	@Column(name = "localizacaoVaga", nullable=false, length=1)	
	private String localizacaoVaga;
	
	@Column(name = "experienciaVaga", nullable=false)
	private Integer experienciaVaga;
	
	public Vagas() {
		
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
		Vagas other = (Vagas) obj;
		return Objects.equals(id, other.id);
	}

	
		
	
	
}
