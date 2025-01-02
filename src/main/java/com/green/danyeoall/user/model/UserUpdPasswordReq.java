package com.green.danyeoall.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserUpdPasswordReq {
    @Schema(title = "유저 PK", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private long userId;
    @Schema(title = "유저 email", example = "qqqq@naver.com")
    private String email;
    @Schema(title = "기존 비밀번호", example = "1234")
    private String upw;
    @Schema(title = "새로운 비밀번호", example = "1234567")
    private String newUpw;
}
