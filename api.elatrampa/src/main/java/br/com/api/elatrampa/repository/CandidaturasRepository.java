package br.com.api.elatrampa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.api.elatrampa.data.model.Candidatura;

public interface CandidaturasRepository extends JpaRepository<Candidatura,Long>{

}
