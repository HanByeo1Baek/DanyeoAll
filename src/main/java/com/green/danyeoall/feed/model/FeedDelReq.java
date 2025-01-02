package com.green.danyeoall.feed.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedDelReq {
    @Schema(title = "피드 PK", requiredMode = Schema.RequiredMode.REQUIRED)
    private long planMasterId;
}
