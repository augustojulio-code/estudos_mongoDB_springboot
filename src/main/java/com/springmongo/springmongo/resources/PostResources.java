package com.springmongo.springmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.springmongo.domain.Post;
import com.springmongo.springmongo.services.PostServices;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    private PostServices services;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = services.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
