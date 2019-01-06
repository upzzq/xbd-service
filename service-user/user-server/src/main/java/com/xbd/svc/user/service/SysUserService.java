package com.xbd.svc.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xbd.svc.user.mapper.SysUserMapper;
import com.xbd.svc.user.pojo.SysUser;

@Service
public class SysUserService {
	
	@Autowired
	private SysUserMapper sysUserMapper;
	public void save() {
		SysUser s = new SysUser();
		s.setId("aaa");
		
		sysUserMapper.insert(s);
		
		
		
		s.setId("bbb");
		sysUserMapper.insert(s);
		int i = 10 / 0;
	}

}
