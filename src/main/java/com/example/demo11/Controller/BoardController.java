package com.example.demo11.Controller;


import com.example.demo11.Dto.BoardListDto;
import com.example.demo11.Entity.Board;
import com.example.demo11.Repository.BoardRepository;
import com.example.demo11.Service.BoardService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/boards")
@AllArgsConstructor
public class BoardController {
    private final BoardService boardService;
    @GetMapping
    public String list(Model model) {
        model.addAttribute("boardList", boardService.list());
        return "/boardContent";
    }

    @GetMapping("/detail/{id}")
    public String boardDetail(@PathVariable long id, Model model) {
        model.addAttribute("board", boardService.detail(id));
        return "/detail";
    }
    // 글목록boardDto --> boarddetaildto
    @GetMapping("/register")
    public String registerGet(BoardListDto boardListDto) {
        boardService.register(boardListDto);
        return  "/register";
    }

    @PostMapping("/register")
    public String registerPost(BoardListDto boardListDto) {
        boardService.register(boardListDto);
        return "redirect:/templates/boardContent.html";
    }

    @GetMapping("/update/{id}")
    public String updateGet(@PathVariable long id, Model model) {
        model.addAttribute("board", boardService.detail(id));
        return "update";
    }
    @PostMapping("/update")
    public String updatePost(Board board) {
        boardService.update(board);
        return "redirect:/boardContent";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        boardService.delete(id);
        return "redirect:/templates/boardContent";
    }
}
