package com.intern.demo.service;

import com.intern.demo.Entity.PostEntity;
import com.intern.demo.Entity.PostEntity;
import com.intern.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<PostEntity> getAllPost() {
        return postRepository.findAll();
    }

    public PostEntity createPostEntity(PostEntity post) {
        post.setPost_id(postRepository.findMaxId() + 1);
        return postRepository.save(post);
    }
}
