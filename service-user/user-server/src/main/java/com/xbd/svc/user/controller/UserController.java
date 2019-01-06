package com.xbd.svc.user.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xbd.hk.user.vo.UserVO;
import com.xbd.svc.common.model.HttpResult;
import com.xbd.svc.user.enums.ServiceExceptionEnum;
import com.xbd.svc.user.exception.ServiceException;
import com.xbd.svc.user.mapper.SysUserMapper;
import com.xbd.svc.user.pojo.SysUser;
import com.xbd.svc.user.service.SysUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private SysUserMapper sysUserMapper;

	@Autowired
	DataSource dataSource;
	
	@Autowired
	private Environment env;

	
	@Autowired
	private SysUserService sysUserService;

	
	@RequestMapping("/{userId}")
	public UserVO getUserById(@PathVariable String userId) {
		SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
		if (sysUser == null) {
			throw new RuntimeException("用户不存在");
		}
		UserVO userVO = new UserVO();
		BeanUtils.copyProperties(sysUser, userVO);
		return userVO;
	}
	
	
	@GetMapping("/index2")
	public HttpResult index2(){
		
		return HttpResult.success(sysUserMapper.selectAll());
	}
	
	
}
