package com.green.danyeoall.feed;

import com.green.danyeoall.common.model.ResultResponse;
import com.green.danyeoall.feed.model.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("feed")
@Tag(name = "피드")
public class FeedController {
    private final FeedService service;

    @PostMapping
    @Operation(summary = "피드 등록")
    public ResultResponse<Integer> insFeed(@RequestBody FeedPostReq p) {
        int result = service.insFeed(p);
        return ResultResponse.<Integer>builder()
                             .resultMessage("피드 등록 완료")
                             .resultData(result)
                             .build();
    }

    @GetMapping("main")
    @Operation(summary = "피드 리스트 메인 화면")
    public ResultResponse<List<FeedGetRes>> selFeedListMain(@ParameterObject FeedGetReq p) {
        List<FeedGetRes> list = service.selFeedListMain(p);
        return ResultResponse.<List<FeedGetRes>>builder()
                             .resultMessage(String.format("%d rows", list.size()))
                             .resultData(list)
                             .build();
    }

    @GetMapping
    @Operation(summary = "피드 리스트")
    public ResultResponse<List<FeedGetRes>> selFeedList(@ParameterObject FeedGetReq p) {
        List<FeedGetRes> list = service.selFeedList(p);
        return ResultResponse.<List<FeedGetRes>>builder()
                .resultMessage(String.format("%d rows", list.size()))
                .resultData(list)
                .build();
    }

    @GetMapping("detail")
    @Operation(summary = "피드 상세 정보")
    public ResultResponse<List<FeedDetailGetRes>> selFeedDetail(@ParameterObject FeedDetailGetReq p) {
        List<FeedDetailGetRes> res = service.selFeedDetail(p);
        return ResultResponse.<List<FeedDetailGetRes>>builder()
                             .resultMessage("피드 상세 정보")
                             .resultData(res)
                             .build();
    }

    @PutMapping
    @Operation(summary = "피드 수정")
    public ResultResponse<Integer> updFeed(@RequestBody FeedPutReq p) {
        int result = service.updFeed(p);
        return ResultResponse.<Integer>builder()
                             .resultMessage("피드 수정 완료")
                             .resultData(result)
                             .build();
    }

    @DeleteMapping
    @Operation(summary = "피드 삭제")
    public ResultResponse<Integer> delFeed(@ParameterObject @ModelAttribute FeedDelReq p) {
        int result = service.delFeed(p);
        return ResultResponse.<Integer>builder()
                             .resultMessage("피드 삭제 완료")
                             .resultData(result)
                             .build();
    }
}
