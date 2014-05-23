package com.wgw.model.card;

import java.util.HashMap;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wgw.model.base.SysLevelParams;
import com.wgw.model.card.base.UserAccount;
/**
 * 
 * @ClassName: UserAccountRequest 
 * @Description: 卡号同步积分和消费总额请求类
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月22日 下午1:57:50 
 *
 */
public class UserAccountRequest extends SysLevelParams{
	
	private HashMap<String, String> paramMap = null;
	
	private ObjectMapper objectMapper = null;
	
	public UserAccountRequest(){
		paramMap = super.getParamMap();
	}
	
	@Getter @Setter private List<UserAccount> userAccounts;//待同步会员账户信息数组
	
	
	public HashMap<String, String> getParamMap() {
		objectMapper = new ObjectMapper();
		String userAccountStr;
		try {
			List<UserAccount> userAccounts = getUserAccounts();
			userAccountStr = objectMapper.writeValueAsString(userAccounts);
			paramMap.put("userAccounts", userAccountStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return paramMap;
	}

}
