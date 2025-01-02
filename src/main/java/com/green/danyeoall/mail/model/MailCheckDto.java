package com.green.danyeoall.mail.model;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MailCheckDto {
    @Email
    private String email;
    private String authCode;
    private LocalDateTime expiredTime;
}
