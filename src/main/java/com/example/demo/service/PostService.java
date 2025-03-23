package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private final List<Post> posts = new ArrayList<>();

    {
        posts.add(new Post(1L, "post 1", new Date()));
        posts.add(new Post(2L, "post 2", new Date()));
        posts.add(new Post(3L, "post 3", new Date()));
    }

    public void create(String text) {
        long id = posts.size() + 1L;
        posts.add(new Post(id, text, new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public Post getPostById(Long id) {
        return posts.stream()
                .filter(post -> post.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
