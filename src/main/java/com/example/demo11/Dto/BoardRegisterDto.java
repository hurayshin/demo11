package com.example.demo11.Dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardRegisterDto {

    private Long id;
    private String title;
    private String userId;
    private String content;
    //builder를 entity에 만들고, entity의 setter를 제외하는게 무조건 좋다. 좋다고 하는데 아직 이해는 못 하겠다.
}
