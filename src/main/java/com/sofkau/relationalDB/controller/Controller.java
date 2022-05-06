package com.sofkau.relationalDB.controller;

import com.sofkau.relationalDB.entity.Comment;
import com.sofkau.relationalDB.entity.Post;
import com.sofkau.relationalDB.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {
    @Autowired
    private PostService service;

    @GetMapping
    public List<Post> getAllPosts(){
        return service.findAllPosts();
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return service.createPost(post);
    }

    @PutMapping
    public Post createComment(@RequestBody Comment comment) {
        return service.createComment(comment);
    }

    @DeleteMapping
    public void deletePost(@RequestBody Post post) {
        service.deletePost(post);
    }

    @DeleteMapping
    public void deleteComment(@RequestBody Comment comment) {
        service.deleteComment(comment);
    }
}
