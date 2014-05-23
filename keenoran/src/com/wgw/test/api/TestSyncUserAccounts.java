package com.wgw.test.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.wgw.constant.Constants;
import com.wgw.model.card.UserAccountRequest;
import com.wgw.model.card.base.UserAccount;
import com.wgw.util.URLUtil;

public class TestSyncUserAccounts {
	
	
	@Test
	public void testUserAccount() throws Exception{

		UserAccountRequest userAccountRequest = new UserAccountRequest();
		userAccountRequest.setHost("http://api.weigou.qq.com");
		userAccountRequest.setUri("/wecard/syncUserAccounts.xhtml");
		
		userAccountRequest.setTimeStamp(1344568374);
		userAccountRequest.setRandomValue(1598632457L);
		userAccountRequest.setUin(1598632457);
		userAccountRequest.setAccessToken("ad39b7dbd59b87cda827223c0e520d6f");
		userAccountRequest.setAppOAuthID("700042973");
		
		userAccountRequest.setFormat("json");
		
		List<UserAccount> userAccounts = new ArrayList<UserAccount>();
		UserAccount u1 = new UserAccount();
		u1.setOpenId("101");
		u1.setCost("10001");
		u1.setPoint("1111");
		u1.setPointVersion("1.0");
		userAccounts.add(u1);
		UserAccount u2 = new UserAccount();
		u2.setOpenId("202");
		u2.setCost("20002");
		u2.setPoint("2222");
		u2.setPointVersion("2.0");
		userAccounts.add(u2);
		userAccountRequest.setUserAccounts(userAccounts);
		HashMap<String, String> paramMap = userAccountRequest.getParamMap();
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,Constants.SECRET_OAUTH_KEY));
	}

}
