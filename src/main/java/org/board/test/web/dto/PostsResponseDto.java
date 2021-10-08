package org.board.test.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.board.test.domain.posts.Posts;

@Getter
@AllArgsConstructor //QueryDsl 에서 쓰기 위해 생성 했음
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
