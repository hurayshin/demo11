package com.example.demo11.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Entity
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String writer;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Reply reply;
    //reply는 일대다로 조인해서 가져온다
    //reply entity도 만든다.

//    public void setId(Long id) {
//        this.id = id;
//    }

}