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
        posts.add(new Post("post 1", new Date()));
        posts.add(new Post("post 2", new Date()));
        posts.add(new Post("post 3", new Date()));
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }
}
