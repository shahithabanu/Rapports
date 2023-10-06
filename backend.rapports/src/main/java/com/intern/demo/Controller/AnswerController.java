package com.intern.demo.Controller;

import com.intern.demo.Entity.AnswerEntity;
import com.intern.demo.repository.AnswerRepository;
import com.intern.demo.service.AnswerService;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AnswerController {
    @Autowired
    AnswerService answerService;

    @Autowired
    AnswerRepository answerRepository;

    @GetMapping("/getAllAnswers")
    public List<AnswerEntity> getAllAnswers() {
        return answerService.getAllAnswer();
    }

    @PostMapping("/addAnswer")
    public AnswerEntity addAnswer(@RequestBody AnswerEntity answerEntity) {
        return answerService.addAllAnswers(answerEntity);


    }
    @DeleteMapping("/deleteAnswer/{id}")
    public String deleteAnswer( @PathVariable int id) {
        answerRepository.deleteById(id);
        return  "Answer Deleted!";
    }
}