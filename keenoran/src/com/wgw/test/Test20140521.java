package com.wgw.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wgw.model.card.UserCardRequest;
import com.wgw.model.card.UserProfileRequest;
import com.wgw.model.card.base.UserCard;
import com.wgw.model.card.base.UserProfile;
import com.wgw.util.URLUtil;


/**
 * 
 * @ClassName: Test20140521 
 * @Description: 
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月21日 上午10:57:56 
 *
 */
public class Test20140521 {
	
	@Test
	public void testUserCard() throws Exception{
		UserCardRequest syncUserCard = new UserCardRequest();
		syncUserCard.setHost("http://api.weigou.qq.com");
		syncUserCard.setUri("/wecard/syncUserCards.xhtml");
		
		syncUserCard.setTimeStamp(1344568374);
		syncUserCard.setRandomValue(1598632457L);
		syncUserCard.setUin(1598632457);
		syncUserCard.setAccessToken("ad39b7dbd59b87cda827223c0e520d6f");
		syncUserCard.setAppOAuthID("700042973");
		
		syncUserCard.setFormat("xml");
		
		List<UserCard> userCards = new ArrayList<UserCard>();
		UserCard u1 = new UserCard();
		u1.setOpenId("u1_openid");
		u1.setCardNo("u1_cardNo");
		u1.setStoreId("u1_storeId");
		userCards.add(u1);
		UserCard u2 = new UserCard();
		u2.setOpenId("u2_openid");
		u2.setOpenId("u2_openid");
		u2.setCardNo("u2_cardNo");
		u2.setStoreId("u2_storeId");
		userCards.add(u2);
		syncUserCard.setUserCards(userCards);
		HashMap<String, String> paramMap = syncUserCard.getParamMap();
		
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,"hdUMwmU4P5jQtHpC"));
		
 	}
	
	
	@Test
	public void testList2Json() throws Exception{
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
		
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,"hdUMwmU4P5jQtHpC"));
		
 	}
	
	
	@Before
	public void before(){
		System.out.println("......start......");
	}
	
	@After
	public void after(){
		System.out.println("......end......");
	}
	
}

