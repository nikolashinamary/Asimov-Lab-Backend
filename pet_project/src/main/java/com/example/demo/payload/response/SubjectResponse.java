package com.example.demo.payload.response;

import com.example.demo.model.Subject;

import java.util.ArrayList;
import java.util.List;
public class SubjectResponse {
    private List<String> subjects;

    public SubjectResponse(List<Subject> subjects){
        this.subjects = new ArrayList<>();
        for(Subject elem: subjects){
            this.subjects.add(elem.getSubjectName());
        }
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}
