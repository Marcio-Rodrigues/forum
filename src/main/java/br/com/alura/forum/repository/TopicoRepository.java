package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alura.forum.model.Topico;
//nao precisa de anotação
public interface TopicoRepository  extends JpaRepository<Topico, Long>{

	List<Topico> findByCurso_Nome(String nomeCurso);
	
	@Query("select t FROM Topico t WHERE t.curso.nome = :nome")
	List<Topico> listarPornome(@Param("nome") String nome);
}
