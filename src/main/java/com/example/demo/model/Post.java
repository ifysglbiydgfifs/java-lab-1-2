package com.example.demo.model;

import java.util.Date;

public class Post {
    private final String text;
    private final Integer likes;
    private final Date creationDate;

    public Post(String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0; // начальное значение для лайков
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
