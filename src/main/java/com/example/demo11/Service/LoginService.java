package com.example.demo11.Service;

import com.example.demo11.Dto.UserDto;
import com.example.demo11.Entity.User;
import com.example.demo11.Mapper.UserMapper;
import com.example.demo11.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class LoginService {

//    private final UserRepository userepository;
//    public List<UserDto> listSimple() throws Exception {
//        return UserRepository.findAll().stream()
//                .map(user -> UserMapper.toSimpleDto(User))
//                .collect(Collectors.toList());
//    }
}
