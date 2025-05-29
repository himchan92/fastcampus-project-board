package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id; //아이디
    private Article article;
    private String content; //댓글

    private LocalDateTime createdAt; //생성일자
    private String createdBy;

    private LocalDateTime modifiedAt;
    private  String modifiedBy;
}
