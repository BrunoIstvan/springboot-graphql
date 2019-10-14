package br.com.bicmsystems.springbootgraphql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bicmsystems.springbootgraphql.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

	public Optional<Author> findByEmail(String email);
	
}
