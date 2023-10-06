package com.intern.demo.repository;

import com.intern.demo.Entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {

    @Query("select coalesce(max(l.post_id), 0) from PostEntity l ")
    public Integer findMaxId();
}
