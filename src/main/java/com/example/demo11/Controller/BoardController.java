package com.example.demo11.Controller;


import com.example.demo11.Dto.BoardListDto;
import com.example.demo11.Dto.BoardRegisterDto;
import com.example.demo11.Entity.Board;
import com.example.demo11.Service.BoardService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;
    @GetMapping
    public String list(Model model) {
        model.addAttribute("boardList", boardService.list());
        return "/boardContent";
    }
    //modal창 만들어서 new instance, 객체로 등록데이터를 보내기.

    @GetMapping("/detail/{id}")
    public String boardDetail(@PathVariable long id, Model model) {
        model.addAttribute("boardDetail", boardService.detail(id));
        return "/boardDetail";
    }
    // 글목록boardDto --> boarddetaildto

    @GetMapping("/register")
    public String registerBoard(Model model) {
        model.addAttribute("boardRegisterDto", new BoardListDto());
        return  "/register";
    }
//    getmapping regist는 지우는 것이 맞고,
//    boardlistdto에 대한 mapper가 없어서, 405 error가 나오고 있따.


    @PostMapping("/register")
    public String registerPost(@ModelAttribute BoardRegisterDto  boardRegisterDto) {
        boardService.register(boardRegisterDto);
        return "redirect:/boards";
    }
    //dto에서도 생성자를 생성했는데도, 자꾸 null값이 들어오는데.. 에러는 나지 않는다.
    //@notnull을 포함하면.. 에러가 발생할 예정..

//    @GetMapping("/update/{id}")
//    public String updateGet(@PathVariable long id, Model model) {
//        model.addAttribute("boardUpdate", boardService.
//        return "update";
//    }
    @PostMapping("/update")
    public String updatePost(Board board) {
        boardService.update(board);
        return "redirect:/boards";
    }
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable long id) {
//        boardService.delete(id);
//        return "redirect:/boards";
//    }
}
