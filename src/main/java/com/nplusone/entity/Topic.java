package com.nplusone.entity;

import com.nplusone.dto.CommentDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

import com.nplusone.dto.TopicDto;

@Data
@NoArgsConstructor
@Entity
@Table(name = "topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long topic_id;

    @Column(name = "title")
    private String title;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "topic")
    private List<Comment> comments;

    public TopicDto build() {
        return TopicDto
                .builder()
                .title(title)
                .comments(this.map())
                .build();
    }

    private List<CommentDto> map() {
        return comments
                .stream()
                .map(Comment::getText)
                .map(text -> CommentDto
                        .builder()
                        .comment(text)
                        .build()
                )
                .collect(Collectors.toList());
    }
}
