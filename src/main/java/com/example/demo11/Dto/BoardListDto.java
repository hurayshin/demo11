package com.example.demo11.Dto;


import lombok.Data;

@Data
public class BoardListDto {
    //entity와 formdata가 있을 때
    //form에서는 글내용(body), 작성자(writer), 글번호(ID), 댓글번호(reply.Id)notempty
    //본문 글자수 제한을 DB에서 넣지말고 Dto에서...

    private Long id;
    private String title;
    private Integer userid;
    private String content;

    //userId join해서 가져오기
    // BoardDto가 리스트 나오는 페이지  =boardDto = listDto =mainlist, mainpage
    // Board 클릭하면 Detail
    // BoardDto에서 글쓰기하면 register
}
