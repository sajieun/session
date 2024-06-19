package com.example.session.db;

import com.example.session.model.UserDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRepository {
    private List<UserDto> userDtoList = new ArrayList<>();

    @PostConstruct
    public void init(){
        userDtoList.add(
                new UserDto(
                   "홍길동"
                )
        );
    }
}
