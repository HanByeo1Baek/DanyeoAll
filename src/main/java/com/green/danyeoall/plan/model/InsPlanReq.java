package com.green.danyeoall.plan.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsPlanReq {
    @JsonIgnore
    private long planMasterId;

    @Schema(title = "유저 PK", example = "1")
    private long userId;
    @Schema(title = "도시 PK", example = "1")
    private long cityId;
    @Schema(title = "시작 시간", example = "2024-11-21")
    private String startDate;
    @Schema(title = "종료 시간", example = "2024-11-23")
    private String endDate;
    @Schema(title = "가는 일 수", description = "1일차, 2일차 등 같은것들", example = "3")
    private String peopleCnt;
    @Schema(title = "여행 일 수", description = "숫자 추가 안하셔도 자동으로 들어갑니다.")
    private int planDate;
}
