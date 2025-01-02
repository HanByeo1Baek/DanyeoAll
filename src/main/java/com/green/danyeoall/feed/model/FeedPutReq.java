package com.green.danyeoall.feed.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedPutReq {
    @Schema(title = "피드 PK", requiredMode = Schema.RequiredMode.REQUIRED)
    private long planMasterId;
    @Schema(title = "플랜 마스터 PK", requiredMode = Schema.RequiredMode.REQUIRED)
    private long userId;
    @Schema(title = "피드 제목")
    private String title;
    @Schema(title = "피드 내용")
    private String content;
}
