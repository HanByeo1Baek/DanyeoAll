package com.green.danyeoall.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserSignUpReq {
    @JsonIgnore
    private long userId;
    @Schema(description = "유저 비밀번호", example = "1212", requiredMode = Schema.RequiredMode.REQUIRED)
    private String upw;
    @Schema(description = "유저 이메일", example = "test@naver.com")
    private String email;
    @Schema(description = "유저 닉네임", example = "홍길동")
    private String nickName;
}
