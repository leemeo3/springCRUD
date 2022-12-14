package com.sparta.spring3wpractice5.dto;

import com.sparta.spring3wpractice5.entity.Board;
import com.sparta.spring3wpractice5.entity.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class BoardResponseDto {
    private Long id;
    private String title;
    private String name;
    private String contents;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    // entity -> Dto
    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.name = board.getName();
        this.contents = board.getContents();
        this.createdAt  = board.getCreatedAt();
        this.modifiedAt = board.getModifiedAt();
    }
}
