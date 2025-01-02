package com.green.danyeoall.city;

import com.green.danyeoall.city.model.CityGetRes;
import com.green.danyeoall.city.model.NewPlacePostReq;
import com.green.danyeoall.city.model.PlaceListGetReq;
import com.green.danyeoall.city.model.PlaceListGetRes;
import com.green.danyeoall.common.model.ResultResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("city")
@Tag(name = "도시")
public class CityController {
    private final CityService service;

    @PostMapping
    @Operation(summary = "신규 장소 등록", description = "필수 옵션 : placeAddress, placeName, category, cityId")
    public ResultResponse<Integer> postCity(@RequestBody NewPlacePostReq p){
        int result = service.postSight(p);
        return ResultResponse.<Integer>builder()
                .resultMessage("신규 장소 등록 완료")
                .resultData(result)
                .build();
    }

    @GetMapping("selCity")
    @Operation(summary = "도시 보기")
    public ResultResponse<List<CityGetRes>> getCityList(){
        List<CityGetRes> res = service.getCity();
        return ResultResponse.<List<CityGetRes>>builder()
                .resultMessage("선택 가능한 도시를 보여준다.")
                .resultData(res)
                .build();
    }

    @GetMapping("selSight")
    @Operation(summary = "장소 보여주기")
    public ResultResponse<List<PlaceListGetRes>> getSightList(@ParameterObject PlaceListGetReq p){
        List<PlaceListGetRes> res = service.getSightList(p);
        return ResultResponse.<List<PlaceListGetRes>>builder()
                .resultMessage("장소 보여주기 완료")
                .resultData(res)
                .build();
    }
}
