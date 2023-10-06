package com.intern.demo.repository;

import com.intern.demo.Entity.LikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntity, Integer> {

        @Query("select coalesce(max(l.like_id), 0) from LikeEntity l ")
        public Integer findMaxId();
    }