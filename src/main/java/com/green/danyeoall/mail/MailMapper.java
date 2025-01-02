package com.green.danyeoall.mail;

import com.green.danyeoall.mail.model.MailCheckDto;
import com.green.danyeoall.mail.model.MemberEmailVerifyReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MailMapper {
    void insAuthInfo (MailCheckDto dto);
    MailCheckDto selAuthInfo (String email);
    int updAuthCheck(MemberEmailVerifyReq p);
}
