package com.green.danyeoall.mail.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailSendDto {
    @Schema(title = "유저 email", example = "by5028@naver.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private String email;
}
