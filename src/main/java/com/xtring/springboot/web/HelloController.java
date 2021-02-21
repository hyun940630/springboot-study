package com.xtring.springboot.web;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // NOTE: JSON을 반환하는 컨트롤러를 만들어 줍니다.
public class HelloController {

    @GetMapping("/hello")   // NOTE: HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 줍니다.
    public String hello() {
        return "hello";
    }
}
