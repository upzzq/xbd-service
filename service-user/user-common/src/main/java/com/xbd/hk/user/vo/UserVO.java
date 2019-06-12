package com.xbd.hk.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
@ApiModel("用户服务查询结果")
public class UserVO {

	@ApiModelProperty(value = "用户id", required = true, example = "999")
	private String id;

	@ApiModelProperty(value = "用户名", example = "888")
	private String username;
	 
	private String nickname;
	 
	private String idNum;
	 
	private String realName;
}
