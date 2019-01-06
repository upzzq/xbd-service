package com.xbd.svc.pro.bbd;

import com.xbd.svc.pro.bbd.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceProBbdApplicationTests {

    @Autowired
    private MailService mailService;

    @Test
    public void contextLoads() {
        mailService.sendSimpleMail("jazhouzq@126.com", "这是第一封邮件", "你好，周子祁");
    }

}

