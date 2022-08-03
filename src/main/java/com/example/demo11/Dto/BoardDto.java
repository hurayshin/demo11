package com.example.demo11.Dto;


import lombok.Data;

@Data
public class BoardDto {
    //entity와 formdata가 있을 때
    //form에서는 글내용(body), 작성자(writer), 글번호(ID), 댓글번호(reply.Id)notempty
    //본문 글자수 제한을 DB에서 넣지말고 Dto에서...

    private Integer id;
    private String content;
    private String writer;

}
