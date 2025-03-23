package com.example.demo.controller;

import com.example.demo.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LikesController {

    private final LikesService likesService;

    @Autowired
    public LikesController(LikesService likesService) {
        this.likesService = likesService;
    }

    @ResponseBody
    @PostMapping(path = "/post/{id}/like")
    public String like(@PathVariable("id") Long id) {
        int likes = likesService.like(id);
        return "" + likes;
    }
}
