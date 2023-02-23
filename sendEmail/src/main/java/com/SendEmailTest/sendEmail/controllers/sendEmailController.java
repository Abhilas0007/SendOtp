package com.SendEmailTest.sendEmail.controllers;

import com.SendEmailTest.sendEmail.dto.ResponseDto;
import com.SendEmailTest.sendEmail.service.sendEmailService;
import com.SendEmailTest.sendEmail.util.ConfigData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class sendEmailController {

    private final sendEmailService sendEmailService;
    @Autowired
    ConfigData configData;

    public sendEmailController(com.SendEmailTest.sendEmail.service.sendEmailService sendEmailService) {
        this.sendEmailService = sendEmailService;
    }

    @PostMapping("/sendOTP/{toEmail}")
    public ResponseEntity<ResponseDto> SendOTP(@PathVariable String toEmail) {
        return sendEmailService.sendEmail(toEmail, "Email Verification OTP", "OTP is:"+ configData.getOtp());
    }
}
