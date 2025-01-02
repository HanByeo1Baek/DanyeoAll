package com.green.danyeoall.feed.like;

import com.green.danyeoall.feed.like.model.FeedLikeReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedLikeService {
    private final FeedLikeMapper feedLikeMapper;

    public int postFeedLike(FeedLikeReq p) {
        int result = feedLikeMapper.postFeedLike(p);
        return result;
    }

    public int deleteFeedLike(FeedLikeReq p) {
        int result = feedLikeMapper.deleteFeedLike(p);
        return result;
    }
}
