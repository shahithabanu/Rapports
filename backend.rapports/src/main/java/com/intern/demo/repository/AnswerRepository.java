
package com.intern.demo.repository;


import com.intern.demo.Entity.AnswerEntity;
import com.intern.demo.repository.AnswerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intern.demo.repository.AnswerRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity,Integer> {
    @Query("select coalesce(max(q.answer_id), 0) from AnswerEntity q")
    public Integer findMaxId();
}


