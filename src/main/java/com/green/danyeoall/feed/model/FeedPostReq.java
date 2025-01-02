package com.green.danyeoall.feed.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(title="피드 등록 요청")
public class FeedPostReq {
    @Schema(title = "플랜 마스터 PK", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private long planMasterId;
    @Schema(title = "피드 제목")
    private String title;
    @Schema(title="피드 내용")
    private String content;
    @Schema(title = "도시")
    private String location;
}
