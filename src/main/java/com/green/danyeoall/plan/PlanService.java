package com.green.danyeoall.plan;


import com.green.danyeoall.plan.detail.InsPlanDetailReq;
import com.green.danyeoall.plan.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlanService {
    private final PlanMapper mapper;

    public int postPlan(InsPlanReq p){

        int result = mapper.insPlan(p);
        return result;
    }

    public int postPlanDetail(InsPlanDetailReq p){
        int result = mapper.insPlanDetail(p);
        return result;
    }

    public List<SelPlanRes> getPlanList(SelPlanReq p){
        log.info("p : {}",p);
        List<SelPlanRes> res = mapper.selPlanList(p);
        return res;
    }

    public int putPlan(UpdPlanReq p){
        int result = mapper.updPlan(p);

        return result;
    }

    public int deletePlan(DelPlanReq p){
        int result = mapper.delPlan(p);
        return result;
    }
}
