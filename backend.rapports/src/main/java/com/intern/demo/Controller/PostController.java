package com.intern.demo.Controller;

import com.intern.demo.Entity.LikeEntity;
import com.intern.demo.Entity.PostEntity;
import com.intern.demo.service.LikeService;
import com.intern.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/AllpostEntity")
    public List<PostEntity> GetAllEntity() {
        return postService.getAllPost();
    }

    @PostMapping("/AddPost")
    public PostEntity CreatepostEntity(@RequestBody PostEntity post) {
         return  postService.  createPostEntity(post);
    }
}

