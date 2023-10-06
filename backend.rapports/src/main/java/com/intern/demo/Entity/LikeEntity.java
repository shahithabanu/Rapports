package com.intern.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="likes")
public class LikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id",nullable = false)
    private Integer like_id;
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "post_id")
    private Integer post_id;

    public LikeEntity(Integer user_id, Integer post_id) {
        this.user_id = user_id;
        this.post_id = post_id;
    }
    public LikeEntity(){

    }
    public Integer getLike_id() {
        return like_id;
    }

    public void setlike_id(Integer like_id) {
        this.like_id = like_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }
}
