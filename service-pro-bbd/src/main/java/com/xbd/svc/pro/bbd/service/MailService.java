package com.xbd.svc.pro.bbd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

   /* @Value("${spring.mail.username}")
    private String from;*/

   /* @Autowired
    private JavaMailSender javaMailSender;*/

    public void sendSimpleMail(String to, String subject, String content){
        /*SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);
        javaMailSender.send(simpleMailMessage);*/
    }
}
