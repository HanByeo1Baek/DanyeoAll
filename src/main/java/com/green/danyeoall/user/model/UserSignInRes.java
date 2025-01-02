package com.green.danyeoall.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(title="로그인 응답")
public class UserSignInRes {
    private long userId;
    private String upw;
    private String nickName;
    @JsonIgnore //swagger 표시 안 되지만, 응답 때 빼는 역할도 한다.
    private String email;
    private String message;
}
