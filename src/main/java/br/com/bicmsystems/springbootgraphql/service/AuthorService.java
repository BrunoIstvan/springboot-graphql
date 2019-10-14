package br.com.bicmsystems.springbootgraphql.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bicmsystems.springbootgraphql.model.Author;
import br.com.bicmsystems.springbootgraphql.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository repository;
	
	public Author create(Author author) {
        return repository.save(author);
    }

    public Optional<Author> findAuthorByEmail(String email) {
        return repository.findByEmail(email);
    }
	
}
