package com.example.demo.controllers;


import com.example.demo.model.Book;
import com.example.demo.model.Subject;
import com.example.demo.payload.request.BooksRequest;
import com.example.demo.payload.request.FileRequest;
import com.example.demo.payload.request.TestCheckRequest;
import com.example.demo.payload.request.TestGenerateRequest;
import com.example.demo.payload.response.*;
import com.example.demo.repo.BooksRepository;
import com.example.demo.repo.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class LoadSubjectsController {
    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    BooksRepository booksRepository;

    @GetMapping("/getsubjects")
//    @PreAuthorize("hasAnyRole()")
    public ResponseEntity<SubjectResponse> getSubjects(){
        return ResponseEntity.ok(new SubjectResponse(subjectRepository.findAll()));
    }

    @GetMapping("/getbooks")
    public ResponseEntity<BookResponse> getBooks(@RequestBody BooksRequest booksRequest){
        List<Book> books = booksRepository.getBooksBySubject(booksRequest.getSubject());
        return ResponseEntity.ok(new BookResponse(books));
    }

    @GetMapping("/getfile")
    public ResponseEntity<FileResponse> getBookFile(@RequestBody FileRequest fileRequest){
        String books = booksRepository.getBookByHeading(fileRequest.getHeader()).getFile();
        return ResponseEntity.ok(new FileResponse(books));
    }

    @GetMapping("/generatetest")
    public ResponseEntity<TestResponse> generateTest(@RequestBody TestGenerateRequest testGenerateRequest){
        RestTemplate restTemplate = new RestTemplate();
        String uri = "http://localhost:4000/generateTest";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<TestGenerateRequest> entity = new HttpEntity<>(testGenerateRequest, headers);
        ResponseEntity<TestResponse> result = restTemplate.exchange(uri, HttpMethod.GET, entity, TestResponse.class);



        return ResponseEntity.ok(result.getBody());
    }

    @GetMapping("/checktest")
    public ResponseEntity<TestCheckResponse> checkTest(@RequestBody TestCheckRequest testCheckRequest){
        List<String> metrics = new ArrayList<>();
        List<Integer> valuesOfMetrics = new ArrayList<>();
        metrics.add("metric1");
        metrics.add("metric2");
        valuesOfMetrics.add(1);
        valuesOfMetrics.add(2);
        return ResponseEntity.ok(new TestCheckResponse(metrics, valuesOfMetrics));

    }


}
