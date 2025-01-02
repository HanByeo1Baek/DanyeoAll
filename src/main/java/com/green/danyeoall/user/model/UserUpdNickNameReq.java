package com.green.danyeoall.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdNickNameReq {
    @Schema(title = "유저 PK", example = "1")
    private long userId;
    @Schema(title = "유저 닉네임", example = "홍길동")
    private String nickName;
}
