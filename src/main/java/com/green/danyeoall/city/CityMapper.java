package com.green.danyeoall.city;

import com.green.danyeoall.city.model.CityGetRes;
import com.green.danyeoall.city.model.NewPlacePostReq;
import com.green.danyeoall.city.model.PlaceListGetReq;
import com.green.danyeoall.city.model.PlaceListGetRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    int insSight(NewPlacePostReq p);
    List<CityGetRes> selCity();
    List<PlaceListGetRes> selSightList(PlaceListGetReq p);
}
