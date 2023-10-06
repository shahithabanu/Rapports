package com.intern.demo.service;

import com.intern.demo.Entity.LikeEntity;
import com.intern.demo.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LikeService {
    @Autowired
    private LikeRepository likeRepository;

    public List<LikeEntity> getAllLike() {
        return likeRepository.findAll();
    }

    public LikeEntity createLikeEntity(LikeEntity likes) {
            likes.setlike_id (likeRepository.findMaxId() + 1);
            return likeRepository.save(likes);
    }
}


