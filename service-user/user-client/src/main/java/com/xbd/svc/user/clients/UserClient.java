package com.xbd.svc.user.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xbd.hk.user.vo.UserVO;

@FeignClient(name = "service-user")
@RequestMapping("/user")
public interface UserClient {

	@GetMapping("/{userId}")
	public UserVO getUserById(@PathVariable("userId") String userId);
	
	
}
