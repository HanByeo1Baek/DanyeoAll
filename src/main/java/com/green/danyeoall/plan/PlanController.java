package com.green.danyeoall.plan;


import com.green.danyeoall.common.model.ResultResponse;
import com.green.danyeoall.plan.detail.InsPlanDetailReq;
import com.green.danyeoall.plan.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("plan")
@Tag(name = "Plan", description = "Plan 관리")
public class PlanController {
    private final PlanService service;

    @PostMapping
    @Operation(summary = "plan 등록")
    public ResultResponse<Integer> postPlan(@RequestBody InsPlanReq p){
        int result = service.postPlan(p);
        return ResultResponse.<Integer>builder()
                .resultMessage("Plan 등록")
                .resultData(result)
                .build();
    }

    @PostMapping("detail")
    @Operation(summary = "PlanDetail 등록")
    public ResultResponse<Integer> postPlanDetail(@RequestBody InsPlanDetailReq p){
        int result = service.postPlanDetail(p);

        return ResultResponse.<Integer>builder()
                .resultMessage("PlanDetail 등록")
                .resultData(result)
                .build();
    }

    @GetMapping
    @Operation(summary = "PlanList 보여주기")
    public ResultResponse<List<SelPlanRes>> getPlanList(@ParameterObject @ModelAttribute SelPlanReq p){
        List<SelPlanRes> res = service.getPlanList(p);
        return ResultResponse.<List<SelPlanRes>>builder()
                .resultMessage("Plan 리스트 보여주기")
                .resultData(res)
                .build();
    }

    @PutMapping
    public ResultResponse<Integer> putPlan(@RequestBody UpdPlanReq p){
        int result = service.putPlan(p);

        return ResultResponse.<Integer>builder()
                .resultMessage("Plan 수정")
                .resultData(result)
                .build();
    }

    @DeleteMapping
    public ResultResponse<Integer> deletePlan(@ModelAttribute DelPlanReq p){
        int result = service.deletePlan(p);

        return ResultResponse.<Integer>builder()
                .resultMessage("Plan 삭제")
                .resultData(result)
                .build();
    }
}
