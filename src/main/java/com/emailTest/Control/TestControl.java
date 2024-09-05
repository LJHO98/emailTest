package com.emailTest.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestControl {
    @GetMapping("/send-mail")
    public String mail(){

        return "emailTest";
    }
}
