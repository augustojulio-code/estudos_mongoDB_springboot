package com.springmongo.springmongo.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongo.springmongo.domain.Post;
import com.springmongo.springmongo.repositories.PostRepository;

@Service
public class PostServices {

    @Autowired
    private PostRepository repositories;

    public Post findById(String id) {
        Optional<Post> obj = repositories.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExecption("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repositories.findByTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);

        return repositories.fullSearch(text, minDate, maxDate);
    }

}
