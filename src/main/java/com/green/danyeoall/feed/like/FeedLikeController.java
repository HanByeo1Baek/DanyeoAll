package com.green.danyeoall.feed.like;

import com.green.danyeoall.common.model.ResultResponse;
import com.green.danyeoall.feed.like.model.FeedLikeReq;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("feed/like")
@Tag(name = "피드 좋아요")
public class FeedLikeController {
    private final FeedLikeService feedLikeService;

    @PostMapping
    @Operation(summary = "피드 좋아요 등록")
    public ResultResponse<Integer> postFeedLike(@RequestBody FeedLikeReq p) {
        int result = feedLikeService.postFeedLike(p);
        return ResultResponse.<Integer>builder()
                .resultMessage("좋아요 등록")
                .resultData(result)
                .build();
    }

    @DeleteMapping
    @Operation(summary = "피드 좋아요 취소")
    public ResultResponse<Integer> deleteFeedLike(@ModelAttribute FeedLikeReq p) {
        int result = feedLikeService.deleteFeedLike(p);
        return ResultResponse.<Integer>builder()
                .resultMessage("좋아요 취소")
                .resultData(result)
                .build();
    }
}
