package com.intern.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.intern.demo.Entity.QuestionEntity;
import com.intern.demo.repository.QuestionRepository;
import com.intern.demo.Entity.QuestionEntity;
import com.intern.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class questionService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<QuestionEntity> getAllQuestions() {

        return questionRepository.findAll();
    }

    public QuestionEntity addQuestion(QuestionEntity questionEntity) {
        questionEntity.setQuestion_id(questionRepository.findMaxId() + 1);
        return questionRepository.save(questionEntity);
    }

    public String deleteQuestion(int question_id) {

        return "deleted" + question_id;
    }
}