package com.nplusone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nplusone.entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {


    //@EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = { "comments"})
    @Override
    List<Topic> findAll();
}
