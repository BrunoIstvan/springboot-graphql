package br.com.bicmsystems.springbootgraphql.web.graphql;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import br.com.bicmsystems.springbootgraphql.model.Author;
import br.com.bicmsystems.springbootgraphql.service.AuthorService;

@Component
public class AuthorGraphQL implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    public Optional<Author> findAuthor(String email){
        return authorService.findAuthorByEmail(email);
    }

    public Author createAuthor(Author author) {
        return authorService.create(author);
    }

}
