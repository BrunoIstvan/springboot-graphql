package br.com.bicmsystems.springbootgraphql.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bicmsystems.springbootgraphql.model.Author;
import br.com.bicmsystems.springbootgraphql.model.Book;
import br.com.bicmsystems.springbootgraphql.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorService authorService;

    public Book create(Book book, String email) throws Exception {
    	Optional<Author> author = authorService.findAuthorByEmail(email);
        book.setAuthor(author.orElseThrow(Exception::new));
        return bookRepository.save(book);
    }

    public Optional<Book> findBook(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }
	
}
