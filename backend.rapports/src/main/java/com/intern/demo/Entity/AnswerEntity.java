package com.intern.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "answer")
public class AnswerEntity{

    @Id
    @Basic
    private Integer answer_id;
    private Integer question_id;
    private String content;
    private Time timestamps;
    private String author;



}
