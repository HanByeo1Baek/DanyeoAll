package com.green.danyeoall.user;

import com.green.danyeoall.mail.MailMapper;
import com.green.danyeoall.user.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final MailMapper mailMapper;

    public int postSignUp(UserSignUpReq p) {
        int result = 0;
        try {
            String hashedPassword = BCrypt.hashpw(p.getUpw(), BCrypt.gensalt());
            UserService.log.debug("hashedPassword : {}", hashedPassword);
            p.setUpw(hashedPassword);

            result = userMapper.insUser(p);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public UserSignInRes postSignIn(UserSignInReq p) {
        UserSignInRes res = null;
        try {
            res = userMapper.postSignIn(p.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public int patchUserNickName(UserUpdNickNameReq p) {
        int result = userMapper.updUserNickName(p);
        return result;
    }

    public int patchUserPassword(UserUpdPasswordReq p) {
        UserSignInRes res = userMapper.postSignIn(p.getEmail());
        log.info("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh{}", p);
        log.info("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh{}", res);
        if( !BCrypt.checkpw(p.getUpw(), res.getUpw()) ) {
            return 0;
        }
        String hashedPassword = BCrypt.hashpw(p.getNewUpw(), BCrypt.gensalt());
        p.setNewUpw(hashedPassword);
        log.info("바뀐p >>>>> {} " , p);
        int result = userMapper.updUserPassword(p);

        return result;
    }
}
