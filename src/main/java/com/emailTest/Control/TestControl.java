package com.emailTest.Control;

import com.emailTest.Service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class TestControl {
    private final MailService mailService;

    @GetMapping("/")
    public String mailPage(){
        return "emailTest";
    }

    @ResponseBody
    @PostMapping("/mail")
    public String MailSend(String mail){

        int number = mailService.sendMail(mail);

        String num = "" + number;
        System.out.println(num);
        return num;
    }



//    @GetMapping("/send-mail")
//    public String mail(){
//
//        return "emailTest";
//    }
}
