package com.intern.demo.service;


import com.intern.demo.Entity.AnswerEntity;
import com.intern.demo.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnswerService {
    @Autowired
    AnswerRepository answerRepository;

    public List<AnswerEntity> getAllAnswer() {
        return answerRepository.findAll();
    }

    public AnswerEntity addAllAnswers(AnswerEntity answerEntity) {
        answerEntity.setAnswer_id(answerRepository.findMaxId() + 1);
        {
            return answerRepository.save(answerEntity);
        }
     //   public String deleteAnswer (int answer_id){

       //     return "deleted" + answer_id;

        }
    }

