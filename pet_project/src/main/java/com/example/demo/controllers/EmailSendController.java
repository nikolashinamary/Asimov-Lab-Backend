package com.example.demo.controllers;

import com.example.demo.payload.request.EmailSendRequest;
import com.example.demo.payload.response.BaseResponse;
import com.example.demo.security.services.EmailConfirmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EmailSendController {

    @Autowired
    private EmailConfirmService emailConfirmService;

    @PostMapping("/send_email")
    public ResponseEntity<BaseResponse> send(@RequestBody EmailSendRequest emailSendRequest){
        String to = emailSendRequest.getTo();
        String subject = emailSendRequest.getSubject();
        String text = emailSendRequest.getText();

        emailConfirmService.sendEmail(to, subject, text);
        return ResponseEntity.ok(new BaseResponse("Email sent successfully", 200));
    }
}
