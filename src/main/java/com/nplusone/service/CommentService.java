package com.nplusone.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nplusone.entity.Comment;
import com.nplusone.repository.CommentRepository;
import com.nplusone.dto.CommentDto;

@Service
public class CommentService {

    private  CommentRepository commentRepository;



   // @Autowired
    /*public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }*/

    public List<CommentDto> getComments() {
        return commentRepository
                .findAll()
                .stream()
                .map(Comment::build)
                .collect(Collectors.toList());
    }
}
