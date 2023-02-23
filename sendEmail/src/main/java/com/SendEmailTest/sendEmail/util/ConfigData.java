package com.SendEmailTest.sendEmail.util;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;

@Component
@Getter
public class ConfigData {

    @Value("${spring.mail.username}")
    String fromEmail;
    @Value("${spring.mail.password}")
    String fromEmailPassword;
    @Value("${spring.mail.port}")
    String port;
    @Value("${spring.mail.host}")
    String host;
    String otp = String.valueOf((int)(Math.random()*(999999-100000+1)+100000));

}
