package com.springmongo.springmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongo.springmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
