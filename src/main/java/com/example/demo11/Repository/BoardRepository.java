package com.example.demo11.Repository;

import com.example.demo11.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
//    Optional<Board> getBoardById(Long id);
//    Optional<Board> getAllById(Long id);
//    Optional<Board> get
//    Board findAllById (Long id);





    //Optional을 사용하면 반복적인 null 체크를 줄일 수 있기 때문에 잘 사용하면 매우 편리한 것 같습니다.
}
