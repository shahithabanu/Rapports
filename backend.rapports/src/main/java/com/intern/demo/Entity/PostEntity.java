package com.intern.demo.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "post")
public class PostEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "post_id", nullable = false)
        private Integer post_id;
        @Column(name = "post_timestamp")
        private Timestamp post_timestamp;
        @Column(name = "post_Author")
        private String post_Author;

        @Column(name = "user_id")
        private Integer user_id;

        public PostEntity() {
        }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public Timestamp getPost_timestamp() {
        return post_timestamp;
    }

    public void setPost_timestamp(Timestamp post_timestamp) {
        this.post_timestamp = post_timestamp;
    }

    public String getPost_Author() {
        return post_Author;
    }

    public void setPost_Author(String post_Author) {
        this.post_Author = post_Author;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public PostEntity(Timestamp post_timestamp, String post_Author, Integer user_id) {
        this.post_timestamp = post_timestamp;
        this.post_Author = post_Author;
        this.user_id = user_id;
    }
}

