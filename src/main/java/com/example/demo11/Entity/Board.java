package com.example.demo11.Entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Entity
@Setter
@NoArgsConstructor
@Table
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String userId;
    private String content;
    @DateTimeFormat(pattern = "yy-MM-dd")
    private LocalDateTime createdAt;
    @DateTimeFormat(pattern = "yy-MM-dd")
    private LocalDateTime updatedAt;


    // get값도 넣어주자.. 타임리프가 인식을 못 한다..




//    @Builder
//    public Board(Long id, String title, String userId, String content, LocalDateTime createdAt, LocalDateTime updatedAt) {
//        this.id = id;
//        this.title = title;
//        this.userId = userId;
//        this.content = content;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }
}