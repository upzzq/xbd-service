package com.xbd.svc.pro.bbd.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xbd.hk.user.vo.UserVO;
import com.xbd.svc.pro.bbd.service.MailService;
import com.xbd.svc.user.clients.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@DefaultProperties(defaultFallback = "defaultFallback")
public class IndexController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/aa")
    @HystrixCommand
    public UserVO aa(String userId){
        int i = 10 / 0;
        RestTemplate restTemplate = new RestTemplate();
        if (userId.equals("1")) {
            return userClient.getUserById("admin");
        }
        restTemplate.getForObject("http://127.0.0.1:8080/index", String.class);
        return null;
    }

    public UserVO defaultFallback(){
        return new UserVO();
        //return "默认服务忙";
    }

    @Autowired
    private MailService mailService;

    @GetMapping("/send")
    public void sendMail(){
        mailService.sendSimpleMail("745888585@qq.com", "这是第一封邮件", "你好，周子祁");
    }


}
