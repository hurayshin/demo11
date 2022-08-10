package com.example.demo11.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Getter
@Setter
public class BoardDetailDto {

    private Long id;
    private String title;
    private String userId;
    @NotEmpty
    private String content;
    @DateTimeFormat(pattern = "yy-MM-dd")
    private LocalDateTime createdAt;
}
