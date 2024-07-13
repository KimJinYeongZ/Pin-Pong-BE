package com.example.pin_pong.domain.dto.response;

import com.example.pin_pong.domain.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostListInfo {
    private Long postId;
    private String postTitle;
    private Long memberId;
}