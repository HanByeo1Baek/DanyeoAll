package com.green.danyeoall.user;

import com.green.danyeoall.user.model.UserSignInRes;
import com.green.danyeoall.user.model.UserSignUpReq;
import com.green.danyeoall.user.model.UserUpdNickNameReq;
import com.green.danyeoall.user.model.UserUpdPasswordReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserSignUpReq p);
    UserSignInRes postSignIn(String uid);
    int updUserNickName(UserUpdNickNameReq p);
    int updUserPassword(UserUpdPasswordReq p);
}
