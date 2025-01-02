package com.green.danyeoall.plan.model;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SelPlanReq {
    @Schema(title = "접속한 유저 PK", example = "1")
    private long userId;
    @Schema(title = "PlanMaster PK", example = "3")
    private long planMasterId;
}
