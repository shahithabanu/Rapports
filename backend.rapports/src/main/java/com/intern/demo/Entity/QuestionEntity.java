package com.intern.demo.Entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;
import java.util.Date;
@Entity
@Table(name = "question")
public class QuestionEntity {

    @Id
    @Basic
    private int question_id;
    private String content;
    private Timestamp timestamps;
    private String asker;

    // Constructors
    public QuestionEntity() {
        // Default constructor
    }

    public QuestionEntity(int id, String content, Timestamp timestamps, String asker) {
        this.question_id = id;
        this.content = content;
        this.timestamps = timestamps;
        this.asker = asker;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(Timestamp timestamps) {
        this.timestamps = timestamps;
    }

    public String getAsker() {
        return asker;
    }

    public void setAsker(String asker) {
        this.asker = asker;
    }}

