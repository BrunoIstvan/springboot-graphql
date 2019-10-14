package br.com.bicmsystems.springbootgraphql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bicmsystems.springbootgraphql.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	public Optional<Book> findByIsbn(String isbn);
	
}
