package com.example.demo11.Service;

import com.example.demo11.Dto.BoardDetailDto;
import com.example.demo11.Dto.BoardRegisterDto;
import com.example.demo11.Entity.Board;
import com.example.demo11.Mapper.BoardMapper;
import com.example.demo11.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    //service 단에 DTO처럼 로직을 가져오지 말라고 하셨으니까 list와 findall을 사용하면 될 것 같다다
    //repository에서 저장 수정 데이터 보관..
//    private final BoardRepository boardRepository;

    private final BoardRepository boardRepository;
//    private final BoardMapper boardMapper;


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
        board.setCreatedAt(boardRegisterDto.getCreatedAt());
        board.setUpdatedAt(boardRegisterDto.getCreatedAt());
        boardRepository.save(board);
    }
    // 등록할 때 RegistDto로 받아야 하는지..?

    public BoardDetailDto boardDetail(Long boardId){
        Board board = boardRepository.findById(boardId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        // return boardMapper.toDetailDto(board);
        return null;
    }
    //repository에서 boardId로 list를 받으면 될 것..

    public void update (Board board) {
        boardRepository.save(board);
    }
    public void delete (Long id) {
        boardRepository.deleteById(id);
    }
}

