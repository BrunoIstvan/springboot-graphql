package br.com.bicmsystems.springbootgraphql.web.graphql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.bicmsystems.springbootgraphql.model.Book;
import br.com.bicmsystems.springbootgraphql.service.BookService;

@Component
public class BookGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private BookService bookService;

    public Optional<Book> findBook(String isbn) {
        return bookService.findBook(isbn);
    }

    public Book createBook(Book book, String email) throws Exception {
        return bookService.create(book, email);
    }

}