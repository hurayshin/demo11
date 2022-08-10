package com.example.demo11.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterDto {

    private String nickname;
    private String password;
    private String email;
}
