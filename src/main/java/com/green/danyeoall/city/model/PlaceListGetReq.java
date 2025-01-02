package com.green.danyeoall.city.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceListGetReq {
    @Schema(name = "지역 구별 번호", example = "1~12")
    private long cityId;
    @Schema(name = "장소 구별 카테고리", description = "명소 : place, 음식점 : restaurant, 숙소 : hotel")
    private String category;

}
