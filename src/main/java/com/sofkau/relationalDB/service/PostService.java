package com.sofkau.relationalDB.service;

import com.sofkau.relationalDB.entity.Comment;
import com.sofkau.relationalDB.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> findAllPosts();
}
