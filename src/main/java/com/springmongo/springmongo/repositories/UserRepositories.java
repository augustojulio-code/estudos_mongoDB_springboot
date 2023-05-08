package com.springmongo.springmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongo.springmongo.domain.User;

public interface UserRepositories extends MongoRepository<User, String> {

}
