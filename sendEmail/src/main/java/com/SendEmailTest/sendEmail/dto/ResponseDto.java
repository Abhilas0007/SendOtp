package com.SendEmailTest.sendEmail.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@Component
public class ResponseDto {
    private String message;

    public ResponseDto(String otpGenerated) {
        message=otpGenerated;
    }
}
