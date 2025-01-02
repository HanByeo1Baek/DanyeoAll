package com.green.danyeoall.feed.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FeedDetailGetReq {
    @Schema(title = "피드 PK", requiredMode = Schema.RequiredMode.REQUIRED)
    private long planMasterId;
    @Schema(title = "로그인 유저 PK", requiredMode = Schema.RequiredMode.REQUIRED)
    private long userId;
}
