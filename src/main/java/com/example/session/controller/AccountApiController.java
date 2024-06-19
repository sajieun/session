package com.example.session.controller;

import com.example.session.Service.UserService;
import com.example.session.model.LoginRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
@RequiredArgsConstructor
public class AccountApiController {

    private final UserService userService;
 // 4. 사용자가 로그인할 수 있게끔 만들어 준 것
    @PostMapping("/login")
    public void login(
            @RequestBody
            LoginRequest loginRequest,

            HttpSession httpSession
    ){
        userService.login(loginRequest,httpSession);
    }
}
