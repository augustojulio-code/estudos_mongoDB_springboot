package com.springmongo.springmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.springmongo.domain.User;
import com.springmongo.springmongo.dto.UserDTO;
import com.springmongo.springmongo.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserServices services;

    @GetMapping()
    public ResponseEntity<List<UserDTO>> findAll() {

        List<User> list = services.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {
        User obj = services.findById(id);
        return ResponseEntity.ok().body(new UserDTO(obj));
    }

}
