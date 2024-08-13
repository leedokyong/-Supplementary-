package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model) {
        /*
        Model
        -뷰(JSP 페이지)에 전달할 데이터를 담는 객체이다.
        - 요청핸들럼 메소드의 매개변수로 Model타입의 변수를 선언하기만 하면
        스프링 MVC가 Model객체를 생성해서 전달한다.
        데이터담기
        model.addAttribute(name,value);
        +name: Model에 저장된 값을 식별하기 ㅇ뒤한 이름이다.
        +value: Model에 저장되는 값이다.
                모든 타입이 허용된다.
                기본자료형,문자열, 객체, 배열, 콜렉션 전부 가능하다.
        * */
        model.addAttribute("message", "홈페이지 방문을 환영합니다.");
        return "index";
    }
}
