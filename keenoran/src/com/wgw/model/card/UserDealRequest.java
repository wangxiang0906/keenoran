package com.wgw.model.card;

import java.util.HashMap;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wgw.model.base.SysLevelParams;
import com.wgw.model.card.base.UserDeal;
/**
 * 
 * @ClassName: UserDealRequest 
 * @Description: 同步会员线下订单请求类
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月22日 下午3:05:46 
 *
 */
public class UserDealRequest extends SysLevelParams{
	
	private HashMap<String, String> paramMap = null;
	
	private ObjectMapper objectMapper = null;
	
	public UserDealRequest(){
		paramMap = super.getParamMap();
	}
	
	@Getter @Setter private List<UserDeal> userDeals;//待同步会员账户信息数组
	
	
	public HashMap<String, String> getParamMap() {
		objectMapper = new ObjectMapper();
		String userDealStr;
		try {
			List<UserDeal> userDeals = getUserDeals();
			userDealStr = objectMapper.writeValueAsString(userDeals);
			paramMap.put("userDeals", userDealStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return paramMap;
	}

}
