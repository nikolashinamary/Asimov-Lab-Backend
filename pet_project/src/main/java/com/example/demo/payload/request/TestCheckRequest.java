package com.example.demo.payload.request;
import java.util.List;
public class TestCheckRequest {
    private List<String> test;

    private String pdfAnswers;

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }

    public String getPdfAnswers() {
        return pdfAnswers;
    }

    public void setPdfAnswers(String pdfAnswers) {
        this.pdfAnswers = pdfAnswers;
    }
}
