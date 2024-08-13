package com.example.demo.config;

import com.example.demo.form.UserRegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    /*
    "요청 USL
    /user/register" 이 요청에 매핑되는 요청핸들러 메소드다.
    이동할 뷰페이지
    "/WEB-INF/views/" user/form + ".jsp"로 이동한다.
     * */
    @GetMapping("/register")
    public String form() {
        return "user/form";
    }

    /*
    + 회원가입 요청을 처리하는 요청핸들러 메소드
    폼 입력값을 전달받는다.
    폼 입력값을 전달받기 위해서 UserRegisterForm 타입의 매개변수를 선언한다.
    +스프링은 사용자정의 클래스가 매개변수로 지정되면 폼 입력값을 담는 용도로 판단한다.
    1. UserRegisterForm객체를 생성한다.
    2. UserRegisterForm객체의 멤버변수를 조사한다.
           String username ---> 요청파라미터명이 "username" 인값이 있다
           String password ---> 요청파라미터명이 "password" 인값이 있다
           String nickname ---> 요청파라미터명이 "nickname" 인값이 있다
           String email ---> 요청파라미터명이 "email" 인값이 있다


       + 요청 URL
       POST방식 요청에 매핑된다.
       "/user/register" 이 요청에 매핑되는 요청핸들러 메소드다.

       +재요청 URL을 응답으로 보낸다.
       user/registered를 재요청하게 하는 응답을 보낸다.
     */
    @PostMapping("/register")
    public String register(UserRegisterForm form) {
        System.out.println(form);
        return "redirect:success";

        /*
        상대주소 표기법
            return "redirect:success";
            return "redirect:user/success";
        현재 URL
        http://localhost/user/register
        기준 URL
        http://localhost/user/

        return "redirect:success";
        http://localhost/user/success (o)

        return "redirect:user/success";
        http://localhost/user/user/success (x)

        절대주소 표기법
            return "redirect:/user/success";

            무조건 http://localhost가 기준이다

            return "redirect:/user/success";
            http://localhost/user/success (o)

        */
    }
    @GetMapping("/success")
    public String completed() {
        return "user/completed";
    }
}
