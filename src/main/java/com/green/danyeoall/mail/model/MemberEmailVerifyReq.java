package com.green.danyeoall.mail.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberEmailVerifyReq {
    @JsonIgnore
    private int authCheck;
    @Schema(title = "회원가입 하려는 유저의 email", example = "by5028@naver.com", requiredMode = Schema.RequiredMode.REQUIRED)
    private String email;
    @Schema(title = "유저가 입력한 인증코드", example = "KxPW8P9x", requiredMode = Schema.RequiredMode.REQUIRED)
    private String authCode;
}
