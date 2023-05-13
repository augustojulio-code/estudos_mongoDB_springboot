package com.springmongo.springmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.springmongo.springmongo.domain.Post;
import com.springmongo.springmongo.domain.User;
import com.springmongo.springmongo.repositories.PostRepository;
import com.springmongo.springmongo.repositories.UserRepositories;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepositories repositories;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        /*
         * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         * sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
         */

        repositories.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        Post post1 = new Post(null, null, "Partiu viagem",
                "Partiu viagem", maria);

        Post post2 = new Post(null, null, "Partiu viagem",
                "Partiu viagem", maria);

        repositories.saveAll(Arrays.asList(maria, alex, bob));

        postRepository.saveAll(Arrays.asList(post1, post2));

    }

}
