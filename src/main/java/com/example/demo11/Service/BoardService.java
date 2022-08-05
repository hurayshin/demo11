package com.example.demo11.Service;

import com.example.demo11.Dto.BoardRegisterDto;
import com.example.demo11.Entity.Board;
import com.example.demo11.Mapper.BoardMapper;
import com.example.demo11.Repository.BoardRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    //service 단에 DTO처럼 로직을 가져오지 말라고 하셨으니까 list와 findall을 사용하면 될 것 같다다
    //repository에서 저장 수정 데이터 보관..
//    private final BoardRepository boardRepository;

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;

    }

    //controller get에 대한 list 값이 없는데..?

    public List<Board> list() {
        return boardRepository.findAll();
    }

    //Dto, entity,
    public void register(BoardRegisterDto boardRegisterDto) {
        Board board = new Board();
        board.setContent(boardRegisterDto.getContent());
        board.setId(boardRegisterDto.getId());
        board.setTitle(boardRegisterDto.getTitle());
        board.setUserId(boardRegisterDto.getUserId());
        boardRepository.save(board);
    }
    // 등록할 때 RegistDto로 받아야 하는지..?

//    site.setIsEnabled(true);
//    Site saved = siteRepository.save(site);
//
//        return siteMapper.toDetailDto(saved);

    public Board detail(long id) {
        return boardRepository.findById(id).orElse(null);
    }

    public void update (Board board) {
        boardRepository.save(board);
    }
    public void delete (long id) {
        boardRepository.deleteById(id);
    }
}

