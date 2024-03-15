package com.example.demo.payload.request;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class TestGenerateRequest {
    @NotBlank
    private String testType;
    @NotBlank
    private String subject;
    @NotBlank
    private Integer numberOfTasks;
    @NotBlank
    private Integer level;
    @NotBlank
    private List<String> topics;
    private String book;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getNumberOfTasks() {
        return numberOfTasks;
    }

    public void setNumberOfTasks(Integer numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }
}
