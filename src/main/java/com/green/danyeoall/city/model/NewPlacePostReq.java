package com.green.danyeoall.city.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewPlacePostReq {
    @Schema(name = "도시 PK", example = "1")
    private long cityId;
    @Schema(name = "장소 주소", example = "대구 광역시 ~~")
    private String placeAddress;
    @Schema(name = "장소 이름", example = "그린컴퓨터아트학원")
    private String placeName;
    @Schema(name = "카테고리", example = "place")
    private String category;
    @Schema(name = "위도")
    private double lat;
    @Schema(name = "경도")
    private double lng;
}