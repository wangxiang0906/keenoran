package com.wgw.test.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.wgw.constant.Constants;
import com.wgw.model.card.UserCardRequest;
import com.wgw.model.card.base.UserCard;
import com.wgw.util.URLUtil;

public class TestSyncUserCard {
	/**
	 * 测试会员卡片信息同步接口
	 * @throws Exception
	 */
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
		
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,Constants.SECRET_OAUTH_KEY));
		
 	}

}
