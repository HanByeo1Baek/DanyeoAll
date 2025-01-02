package com.green.danyeoall.feed.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.green.danyeoall.common.model.Paging;
import lombok.Getter;

@Getter
public class FeedGetReq extends Paging {
    @JsonIgnore
    private Long planMasterId;

    public FeedGetReq(Integer page, Integer size, Long planMasterId) {
        super(page, size);
        this.planMasterId = planMasterId;
    }
}
