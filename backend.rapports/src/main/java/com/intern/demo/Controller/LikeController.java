package com.intern.demo.Controller;

import com.intern.demo.Entity.LikeEntity;
import com.intern.demo.repository.LikeRepository;
import com.intern.demo.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LikeController {
    @Autowired
    private LikeService likeService;

    @GetMapping("/getAlllikeEntity")
    public List<LikeEntity> GetAllEntity() {
        return likeService.getAllLike();
    }

    @PostMapping("/AddLike")
    public LikeEntity CreatelikeEntity(@RequestBody LikeEntity likes) {

          return  likeService. createLikeEntity(likes);

        }

    }


