package com.springmongo.springmongo.resources;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.springmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        User user = new User("1", "maria", "maria@gmail.com");
        User user1 = new User("2", "josé", "jose@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(user, user1));

        return ResponseEntity.ok().body(list);
    }

}
