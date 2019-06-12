package com.xbd.svc.user.controller;

import com.xbd.hk.user.vo.UserVO;
import com.xbd.svc.common.model.HttpResult;
import com.xbd.svc.user.mapper.SysUserMapper;
import com.xbd.svc.user.service.SysUserService;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    DataSource dataSource;

    @Autowired
    private Environment env;


    @Autowired
    private SysUserService sysUserService;


    @RequestMapping("/getUserById")
    public UserVO getUserById(Integer age, @NotBlank(message = "用户id不能为空") String userId) {
		/*SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
		if (sysUser == null) {
			throw new RuntimeException("用户不存在");
		}
		UserVO userVO = new UserVO();
		BeanUtils.copyProperties(sysUser, userVO);
		return userVO;*/
        throw new RuntimeException("用户不存在");
        //throw new UserServiceException(ServiceExceptionEnum.ERROR_Ex);
		/*UserVO userVO = new UserVO();
		userVO.setId("666");
		userVO.setIdNum("333");
		userVO.setNickname("gdgdg");
		userVO.setUsername("发说说a");
		return userVO;*/
    }


    @GetMapping("/index2")
    public HttpResult index2() {

        return HttpResult.success(sysUserMapper.selectAll());
    }
    
    @GetMapping("/users")
    String users(@RequestBody UserVO userVO) {
        return "users";
    }
}
