package com.springboot2.springit.repositories;


import com.springboot2.springit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment,Long> {
}
