package com.green.danyeoall.city.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityGetRes {
    @Schema(name = "도시 PK", example = "1")
    private long cityId;
    @Schema(name = "한국 이름", example = "서울")
    private String cityKorName;
    @Schema(name = "영어 이름", example = "Seoul")
    private String cityEngName;
    @Schema(name = "도시 사진")
    private String cityPic;
    @Schema(name = "도시 색깔")
    private String color;
}
