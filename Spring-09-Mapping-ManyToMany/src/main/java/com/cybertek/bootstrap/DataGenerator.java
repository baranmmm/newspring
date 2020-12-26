package com.cybertek.bootstrap;

import com.cybertek.entity.Post;
import com.cybertek.entity.Tag;
import com.cybertek.repository.PostService;
import com.cybertek.repository.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PostService postService;

//    @Autowired
//    TagService tagService;



    @Override
    public void run(String... args) throws Exception {

        Post post1=new Post("MVC", "Controller");
        Post post2=new Post("ORM", "Hibernate");

        Tag tag1=new Tag("Springboot");
        Tag tag2=new Tag("Spring");

        post1.getTags().add(tag1);
        post1.getTags().add(tag2);
        post2.getTags().add(tag1);


        tag1.getPosts().add(post2);
        tag1.getPosts().add(post1);
        tag2.getPosts().add(post1);

        postService.save(post1);
        postService.save(post2);





    }
}
