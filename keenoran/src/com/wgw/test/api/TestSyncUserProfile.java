package com.wgw.test.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.wgw.constant.Constants;
import com.wgw.model.card.UserProfileRequest;
import com.wgw.model.card.base.UserProfile;
import com.wgw.util.URLUtil;

public class TestSyncUserProfile {
	/**
	 * 测试会员个人信息同步接口
	 * @throws Exception
	 */
	@Test
	public void testUserProfile() throws Exception{
		UserProfileRequest syncUserProfile = new UserProfileRequest();
		syncUserProfile.setHost("http://api.weigou.qq.com");
		syncUserProfile.setUri("/wecard/syncUserProfiles.xhtml");
		
		syncUserProfile.setTimeStamp(1344568374);
		syncUserProfile.setRandomValue(1598632457L);
		syncUserProfile.setUin(1598632457);
		syncUserProfile.setAccessToken("ad39b7dbd59b87cda827223c0e520d6f");
		syncUserProfile.setAppOAuthID("700042973");
		
		syncUserProfile.setFormat("xml");
		
		List<UserProfile> userProfiles = new ArrayList<UserProfile>();
		UserProfile u1 = new UserProfile();
		u1.setOpenId("u1_openid");
		u1.setName("u1_name");
		u1.setSex("M");
		userProfiles.add(u1);
		UserProfile u2 = new UserProfile();
		u2.setOpenId("u2_openid");
		u2.setName("u2_name");
		u2.setSex("F");
		userProfiles.add(u2);
		syncUserProfile.setUserProfiles(userProfiles);
		HashMap<String, String> paramMap = syncUserProfile.getParamMap();
		
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,Constants.SECRET_OAUTH_KEY));
			
	}

}
