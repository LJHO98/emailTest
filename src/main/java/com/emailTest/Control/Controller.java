package com.emailTest.Control;

import com.emailTest.Dto.EmailMessage;
import com.emailTest.Service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final EmailService emailService;

    @PostMapping("/send-mail")
    public ResponseEntity sendMail(){
        EmailMessage emailMessage = EmailMessage.builder()
                .to("ehdgoanf714@naver.com")
                .subject("테스트 메일 제목")
                .message("테스트 메일 본문")
                .build();
        emailService.sendMail(emailMessage);
        return new ResponseEntity(HttpStatus.OK);
    }


}
