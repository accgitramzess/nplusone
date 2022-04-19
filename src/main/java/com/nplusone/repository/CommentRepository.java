package com.nplusone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nplusone.entity.Comment;


@Repository
public interface CommentRepository /*extends JpaRepository<Comment, Integer>*/ {

    /*@EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "topic"
            }
    )
    @Override*/
    List<Comment> findAll();
}
