package com.nplusone.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TopicDto {

    private String title;

    private List<CommentDto> comments;
}
