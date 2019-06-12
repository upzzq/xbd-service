package com.xbd.svc.user.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.xbd.hk.user.vo.UserVO;

import java.util.List;

@FeignClient(name = "service-user")
@RequestMapping("/user")
public interface UserClient {

	@GetMapping("/getUserById")
	UserVO getUserById(@RequestParam("userId") String userId);

	@GetMapping(value = "/users")
	String users(UserVO userVO);
	
	
}
