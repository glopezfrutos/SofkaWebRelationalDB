package com.sofkau.relational_db.service;

import com.sofkau.relational_db.entity.Comment;
import com.sofkau.relational_db.entity.Post;

import java.util.List;

public interface PostService {
    Post createPost(Post post);

    Post createComment(Comment comment);

    void deleteComment(Comment comment);

    void deletePost(Post post);

    List<Post> findAllPosts();
}
