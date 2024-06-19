package com.example.session.controller;

import com.example.session.model.UserDto;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserApiController {

    // 자신의 정보를 가져오는 api
    @GetMapping("/me")
    public UserDto me(
            // AccountApiController에 있는 session 불러오기
            HttpSession httpSession
    ){
        // 불러오고
        var userObject = httpSession.getAttribute("USER");

        // UserDto null이 아니면
        if (userObject != null){
            // 강제 형변환
            var userDto = (UserDto) userObject;
            return userDto;
        }else {
            return null;
        }
    }
}
