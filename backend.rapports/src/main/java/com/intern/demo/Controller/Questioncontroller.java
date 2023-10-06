package com.intern.demo.Controller;

import com.intern.demo.Entity.QuestionEntity;
import com.intern.demo.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import com.intern.demo.service.questionService;
import java.util.List;

@CrossOrigin
@RestController
public class Questioncontroller
{

    @Autowired
    questionService questionService;


    @GetMapping("/getAllQuestion")
    public List<QuestionEntity> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }
    @PostMapping("/addQuestion")
    public QuestionEntity addQuestion(@RequestBody QuestionEntity questionEntity)
    {
        return questionService.addQuestion(questionEntity);
    }

    @DeleteMapping("/deleteQuestion/{question_id}")
    public String deleteQuestion(@PathVariable int question_id)
    {
        return questionService.deleteQuestion(question_id);
    }
}