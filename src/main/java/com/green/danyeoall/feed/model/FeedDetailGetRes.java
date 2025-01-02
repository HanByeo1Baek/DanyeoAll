package com.green.danyeoall.feed.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Schema(title = "마이페이지 피드 정보")
public class FeedDetailGetRes {
    @Schema(title = "피드 제목")
    private String title;
    @Schema(title = "피드 내용")
    private String content;
    @Schema(title = "플랜 시작일")
    private String startDate;
    @Schema(title = "플랜 종료일")
    private String endDate;
    @Schema(title = "인원")
    private int peopleCnt;
    @Schema(title = "도시 이름")
    private String cityName;
    @Schema(title = "도시 색상")
    private String color;
    @Schema(title = "명소 PK")
    private long placeId;
    @Schema(title = "비용")
    private int price;
    @Schema(title = "메모")
    private String memo;
    @Schema(title = "플랜 시작 시간")
    private String startTime;
    @Schema(title = "플랜 종료 시간")
    private String endTime;
    @Schema(title = "일차")
    private String date;
}
