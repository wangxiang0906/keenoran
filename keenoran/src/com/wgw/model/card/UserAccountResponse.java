package com.wgw.model.card;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.wgw.model.base.BaseResponse;

/**
 * 
 * @ClassName: UserAccountResponse 
 * @Description: 卡号同步积分和消费总额响应类 
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月22日 下午2:00:25 
 *
 */
public class UserAccountResponse extends BaseResponse{	
	@Getter @Setter private List<String> failedOpenIds;//同步失败用户的openId列表
}
