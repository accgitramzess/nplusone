package com.nplusone.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nplusone.entity.Topic;
import com.nplusone.repository.TopicRepository;
import com.nplusone.dto.TopicDto;

@Service
public class TopicService {

    private final TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<TopicDto> getTopics() {
        return topicRepository
                .findAll()
                .stream()
                .map(Topic::build)
                .collect(Collectors.toList());
    }

    public Topic getTopicByTopicId(Integer topicId) {
        return topicRepository
                .findById(topicId)
                .orElseThrow(RuntimeException::new);
    }
}
