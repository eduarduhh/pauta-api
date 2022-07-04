package br.com.eduardo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.eduardo.entity.Sessao;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, Long> {

	Optional<Sessao> findByDescricao(String descricao);

	Optional<Sessao> findByIdAndIndicExclusao(Long id, Boolean indicExclusao);

	Optional<Sessao> findByDescricaoAndIndicExclusao(String descricao, Boolean indicExclusao);

	 List<Sessao> findAllByIndicExclusao(Boolean indicExlusao);
	 
	 @Query(value = "SELECT s FROM Sessao s  JOIN FETCH s.votacaos WHERE s.id = :id")
	 Optional<Sessao> findSessaoComVotos(Long id);
}
