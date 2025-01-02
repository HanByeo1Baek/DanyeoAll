package com.green.danyeoall.city.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceListGetRes {
    @Schema(name = "PK")
    private long placeId;

    @Schema(name = "장소 이름", example = "서울남산타워")
    private String placeName;

    @Schema(name = "장소 사진")
    private String placePic;

    @Schema(name = "장소 주소", example = "서울특별시 ~~")
    private String placeAddress;

    @Schema(name = "별점", example = "4.5")
    private double placeStar;
}
