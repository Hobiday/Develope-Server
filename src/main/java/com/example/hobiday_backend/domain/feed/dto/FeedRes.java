package com.example.hobiday_backend.domain.feed.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class FeedRes {
    private String contents;
    private String profileName;
    private List<String> hashTag;
    private List<String> feedFiles;
    private int likeCount;
    private boolean isLiked;
}
