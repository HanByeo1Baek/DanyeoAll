package com.green.danyeoall.feed.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Schema(title = "피드 정보")
public class FeedGetRes {
    @Schema(title = "피드 PK")
    private long planMasterId;
    @Schema(title = "도시 사진")
    private String cityPic;
    @Schema(title = "피드 제목")
    private String title;
    @Schema(title = "도시 색상")
    private String color;
    @Schema(title = "도시 이름")
    private String cityName;
    @Schema(title = "피드 생성일시")
    private String createdAt;
    @Schema(title = "좋아요 수")
    private int likeCnt;
}
