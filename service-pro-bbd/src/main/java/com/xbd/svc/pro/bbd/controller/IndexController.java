package com.xbd.svc.pro.bbd.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xbd.hk.user.vo.UserVO;
import com.xbd.svc.user.clients.UserClient;
import io.swagger.annotations.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "defaultFallback")
@Api(tags = "测试用", description = "这是一个说明")
public class IndexController {

    @Autowired
    private UserClient userClient;

    @PostMapping("/aa")
    @ApiOperation("测试服务异常触发Hystrix")
    @HystrixCommand
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户Id", example = "999", required = true, paramType = "path"),
            @ApiImplicitParam(name = "username", value = "用户名", example = "745", paramType = "path") })
    public UserVO aa(Integer userId, Integer username){
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



    @GetMapping("/tt")
    @ApiOperation("用于给其他服务调用的Feign测试接口")
    public UserVO tt(){
        System.out.println(log.isDebugEnabled());
        String userId = null;
        UserVO userVO = new UserVO();
        userVO.setUsername("呵呵");
        //userClient.users(userVO);
        userClient.getUserById("aa");
        return userVO;
    }

}
