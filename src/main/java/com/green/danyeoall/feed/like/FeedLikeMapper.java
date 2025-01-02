package com.green.danyeoall.feed.like;

import com.green.danyeoall.feed.like.model.FeedLikeReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FeedLikeMapper {
    int postFeedLike(FeedLikeReq p);
    int deleteFeedLike(FeedLikeReq p);
}
