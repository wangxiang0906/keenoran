package com.wgw.model.card;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wgw.model.base.SysLevelParams;
import com.wgw.model.card.base.UserProfile;

public class UserProfileRequest extends SysLevelParams{
	
	private HashMap<String, String> paramMap = null;
	
	private ObjectMapper objectMapper = null;
	
	public UserProfileRequest(){
		paramMap = super.getParamMap();
	}
	
	private List<UserProfile> userProfiles;//待同步会员个人信息数组
	
	
	
	public List<UserProfile> getUserProfiles() {
		return userProfiles;
	}



	public void setUserProfiles(List<UserProfile> userProfiles){
		this.userProfiles = userProfiles;
	}



	public HashMap<String, String> getParamMap() {
		objectMapper = new ObjectMapper();
		String userProfileStr;
		try {
			List<UserProfile> userProfiles = getUserProfiles();
			userProfileStr = objectMapper.writeValueAsString(userProfiles);
			paramMap.put("userProfiles", userProfileStr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return paramMap;
	}
	
}
