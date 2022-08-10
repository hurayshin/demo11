package com.example.demo11.Mapper;


import com.example.demo11.Dto.BoardDetailDto;
import com.example.demo11.Entity.Board;
import org.mapstruct.Mapper;

//@Mapper
@Mapper(componentModel = "spring")
public interface BoardMapper {


    BoardDetailDto toDetailDto(Board saved);



    //원래는 private로 선언해줘야 하지만, Entity에서 builder로 보내는 패턴을 안정시켰기 때문에, mapper로 받을 때 public으로 받아도
    //구조상 문제가 없다고 한다. 보낼 때 혹은 받을 때 체크하는 방식인데, mapstruct는 entity에 가까운 처리방식을 선호하는 것으로 보인다.

    //정욱님은 stream을 사용하셨다.
//    public List<SiteListDto> listSimple() {
//        return siteRepository.findAll().stream()
//                .map(site -> siteMapper.toSimpleDto(site))
//                .collect(Collectors.toList());
//    }
    //객체를 list type으로 만드는게 아니라, 객체에는 여러 인스턴스가 있기 때문에 type list로 이름을 만드는 것이 직관적인데,
    //repository에서 site entity에서 얻고 싶은 필드값들을 getby Id단위 혹은 All(형태가 list같은 객체)로
    //himom에서는 list, all로 변수명이 정해져 있지만 실제 데이터는 entity 필드값들이 뭉쳐진 객체로 고정되어 있다.
    //return.findall로 필드 개수를 체크하고, .map가 listDto를 거쳐서 클라이언트에게 받은 데이터의 위치가 entity위치에서 온 것인지 확인하고
    //,map이 검증한 값을 .collect가 다시 수집해(검증 중에 대기중이던 데이터)를 to list 형태로 저장한다.
    //web의 입력부분을 제외한 service, mapper, repository의 과정을 내 생각대로 요약했다.


}
