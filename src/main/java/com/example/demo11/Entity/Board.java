package com.example.demo11.Entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Entity
@Setter
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String userId;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public void setContent() {
    }

    public void setId() {
    }

    public void setTitle() {
    }

    public void setCreatedAt() {
    }

    public void setUpdatedAt() {
    }

    public void setUserId() {
    }

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