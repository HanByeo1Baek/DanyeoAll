package com.green.danyeoall.plan.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelPlanRes {
    @Schema(title = "장소 PK")
    private long placeId;
    @Schema(title = "사람 숫자")
    private int peopleCnt;
    @Schema(title = "가격")
    private int price;
    @Schema(title = "출발 날짜")
    private String startDate;
    @Schema(title = "도착 날짜")
    private String endDate;
    @Schema(title = "메모")
    private String memo;
    @Schema(title = "출발 시간")
    private String startTime;
    @Schema(title = "도착 시간")
    private String endTime;
    @Schema(title = "몇 일차")
    private String date;
}
