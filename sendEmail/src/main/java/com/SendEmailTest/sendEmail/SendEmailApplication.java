package com.SendEmailTest.sendEmail;

import com.SendEmailTest.sendEmail.service.sendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendEmailApplication {
//	@Autowired
//	private sendEmailService sendEmailService;
	public static void main(String[] args) {
		SpringApplication.run(SendEmailApplication.class, args);
	}
//	@EventListener(ApplicationReadyEvent.class)
//	public void sendEmail() {
//		String otp = String.valueOf((int)(Math.random()*(999999-100000+1)+100000));
//		sendEmailService.sendEmail("**************","TestEmailing","OTP is:"+ otp);
//	}

}
