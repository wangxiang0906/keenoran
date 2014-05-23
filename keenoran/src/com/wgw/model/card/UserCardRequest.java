package com.wgw.model.card;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wgw.model.base.SysLevelParams;
import com.wgw.model.card.base.UserCard;

public class UserCardRequest extends SysLevelParams{
	
	private HashMap<String, String> paramMap = null;
	
	private ObjectMapper objectMapper = null;
	
	public UserCardRequest(){
		paramMap = super.getParamMap();
	}
	
	private List<UserCard> userCards;//待同步会员卡片信息数组


	public List<UserCard> getUserCards() {
		return userCards;
	}
	public void setUserCards(List<UserCard> userCards) {
		this.userCards = userCards;
	}



	public HashMap<String, String> getParamMap() {
		objectMapper = new ObjectMapper();
		String userCardStr;
		try {
			List<UserCard> userProfiles = getUserCards();
			userCardStr = objectMapper.writeValueAsString(userProfiles);
			paramMap.put("userCards", userCardStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return paramMap;
	}
	
}
