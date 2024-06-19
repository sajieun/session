package com.example.session.db;

import com.example.session.model.UserDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserRepository {
    // 1. 공백에 list를 만듦
    private List<UserDto> userDtoList = new ArrayList<>();

    // 3. 이름을 하나씩 분석 해서 같은 이름 발견 시 가장 첫번째 껄 return
    public Optional<UserDto> findByName(String name){
        // 만약에 같은 이름이 존재한다면 찾아서 첫번째로 발견된 이름을 보여달라
        return userDtoList
                .stream()
                .filter(it-> it.getUsername().equals(name))
                .findFirst();
    }

    // 2. list에 값을 넣어줌
    @PostConstruct
    public void init(){
        userDtoList.add(
                new UserDto(
                   "홍길동", "1234"
                )
        );
        userDtoList.add(
                new UserDto(
                        "사지은", "1234"
                )
        );
        userDtoList.add(
                new UserDto(
                        "사지임", "1234"
                )
        );
    }
}
