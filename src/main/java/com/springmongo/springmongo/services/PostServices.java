package com.springmongo.springmongo.services;

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

}
