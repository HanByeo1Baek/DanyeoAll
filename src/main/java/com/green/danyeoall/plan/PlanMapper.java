package com.green.danyeoall.plan;


import com.green.danyeoall.plan.detail.InsPlanDetailReq;
import com.green.danyeoall.plan.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlanMapper {
    int insPlan(InsPlanReq p);
    int insPlanDetail(InsPlanDetailReq p);
    List<SelPlanRes> selPlanList(SelPlanReq p);
    int updPlan(UpdPlanReq p);
    int delPlan(DelPlanReq p);
}
