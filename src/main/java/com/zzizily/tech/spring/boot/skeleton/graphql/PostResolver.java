package com.zzizily.tech.spring.boot.skeleton.graphql;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLResolver;

public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDao authorDao;

    public PostResolver(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public Optional<Author> getAuthor(Post post) {
        return authorDao.getAuthor(post.getAuthorId());
    }
}