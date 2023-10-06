package com.intern.demo.repository;

import com.intern.demo.Entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import com.intern.demo.Entity.QuestionEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Optional;

public interface QuestionRepository extends JpaRepository<QuestionEntity,Integer> {
    @Query("select coalesce(max(q.question_id), 0) from QuestionEntity q")
    public Integer findMaxId();

//    Optional<QuestionEntity> findAllById(long id);
}
