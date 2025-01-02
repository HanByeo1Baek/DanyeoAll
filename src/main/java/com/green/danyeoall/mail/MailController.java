package com.green.danyeoall.mail;

import com.green.danyeoall.common.model.ResultResponse;
import com.green.danyeoall.mail.model.MailSendDto;
import com.green.danyeoall.mail.model.MemberEmailVerifyReq;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;

@RestController
@RequiredArgsConstructor
@Tag(name = "이메일", description = "이메일 인증 과정")
public class MailController {

    private final MailService mailService;

    @ResponseBody
    @PostMapping("/email-check") // 이 부분은 각자 바꿔주시면 됩니다.
    public String emailCheck(@RequestBody MailSendDto mailDto) throws MessagingException, UnsupportedEncodingException {
        String authCode = mailService.sendSimpleMessage(mailDto.getEmail());
        return authCode; // Response body에 값을 반환
    }

    @PatchMapping("/auth-check")
    public ResultResponse<Integer> updAuthCheck(@RequestBody MemberEmailVerifyReq p) {
        int result = mailService.verifyCode(p);
        return ResultResponse.<Integer>builder()
                .resultMessage(result == 1 ? "인증되었습니다." : "인증되지 않았습니다.")
                .resultData(result)
                .build();
    }
}
