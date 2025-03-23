package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesService {

    private final PostService postService;

    @Autowired
    public LikesService(PostService postService) {
        this.postService = postService;
    }

    public int like(Long postId) {
        Post post = postService.getPostById(postId);
        if (post != null) {
            post.setLikes(post.getLikes() + 1);
            return post.getLikes();
        }
        return 0;
    }
}
