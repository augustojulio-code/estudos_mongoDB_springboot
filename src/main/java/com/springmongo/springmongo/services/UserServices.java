package com.springmongo.springmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongo.springmongo.domain.User;
import com.springmongo.springmongo.dto.UserDTO;
import com.springmongo.springmongo.repositories.UserRepositories;

@Service
public class UserServices {

    @Autowired
    private UserRepositories repositories;

    public List<User> findAll() {

        return repositories.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repositories.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExecption("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repositories.insert(obj);
    }

    public User fromDTO(UserDTO objDto) {

        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
