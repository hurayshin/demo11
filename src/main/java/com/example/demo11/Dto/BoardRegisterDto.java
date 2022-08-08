package com.example.demo11.Dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardRegisterDto {

    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String userId;
    @NotNull
    private String content;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime createdAt;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime updatedAt;
    //builder를 entity에 만들고, entity의 setter를 제외하는게 무조건 좋다. 좋다고 하는데 아직 이해는 못 하겠다.
}
