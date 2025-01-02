package com.green.danyeoall.city;

import com.green.danyeoall.city.model.CityGetRes;
import com.green.danyeoall.city.model.NewPlacePostReq;
import com.green.danyeoall.city.model.PlaceListGetReq;
import com.green.danyeoall.city.model.PlaceListGetRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityMapper mapper;

    public int postSight(NewPlacePostReq p){
        int result = mapper.insSight(p);
        return result;
    }

    public List<CityGetRes> getCity(){
        List<CityGetRes> res = mapper.selCity();
        return res;
    }

    public List<PlaceListGetRes> getSightList(PlaceListGetReq p){
        List<PlaceListGetRes> res = mapper.selSightList(p);
        return res;
    }
}
