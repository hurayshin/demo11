package com.example.demo11.Dto;

import lombok.Data;


@Data
public class UserDto {
    private Long id;
    private String writer;
    private String Password;
    //UserDto는 user registDto
    //등록할 때 받는 데이터타입들
}
