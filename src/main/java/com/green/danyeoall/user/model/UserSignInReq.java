package com.green.danyeoall.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(title = "로그인 요청")
public class UserSignInReq {
    @Schema(title = "이메일", example = "test.naver.com")
    private String email;
    @Schema(title = "비밀번호", example = "1212", requiredMode = Schema.RequiredMode.REQUIRED)
    private String upw;
}
