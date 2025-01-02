package com.green.danyeoall.plan.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdPlanReq {
    @Schema(title = "여행계획 PK", example = "1")
    private long planId;
    @Schema(title = "도시 PK", example = "213")
    private long placeId;
    @Schema(title = "가격", example = "10000")
    private int price;
    @Schema(title = "메모", example = "할로")
    private String memo;
    @Schema(title = "출발 시간", example = "17:00:00")
    private String startTime;
    @Schema(title = "도착 시간", example = "19:00:00")
    private String endTime;
    @Schema(title = "몇일차", example = "2")
    private String date;
}
