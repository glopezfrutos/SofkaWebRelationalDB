package com.sofkau.relationalDB.repository;

import com.sofkau.relationalDB.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
