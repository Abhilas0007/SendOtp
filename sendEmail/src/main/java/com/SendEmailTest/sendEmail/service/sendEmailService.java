package com.SendEmailTest.sendEmail.service;

import com.SendEmailTest.sendEmail.dto.ResponseDto;
import com.SendEmailTest.sendEmail.util.ConfigData;
import com.SendEmailTest.sendEmail.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class sendEmailService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    ConfigData configData;

    public ResponseEntity<ResponseDto> sendEmail(String toEmail, String subject, String body) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(configData.getFromEmail());
            message.setTo(toEmail);
            message.setText(body);
            message.setSubject(subject);

            javaMailSender.send(message);
            System.out.println("Mail sent successfully");
            return new ResponseEntity<>(new ResponseDto(Constants.OTP_GENERATED), HttpStatus.OK);
        } catch (MailException e) {
            return new ResponseEntity<>(new ResponseDto(Constants.OTP_GENERATION_FAILED), HttpStatus.BAD_REQUEST);
        }
    }
}
