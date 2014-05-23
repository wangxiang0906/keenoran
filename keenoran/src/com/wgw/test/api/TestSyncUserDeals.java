package com.wgw.test.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.wgw.constant.Constants;
import com.wgw.model.card.UserDealRequest;
import com.wgw.model.card.base.Extension;
import com.wgw.model.card.base.ItemData;
import com.wgw.model.card.base.UserDeal;
import com.wgw.util.URLUtil;

public class TestSyncUserDeals {
	
	
	@Test
	public void testUserDeal() throws Exception{

		UserDealRequest userDealRequest = new UserDealRequest();
		userDealRequest.setHost("http://api.weigou.qq.com");
		userDealRequest.setUri("/wecard/syncUserDeals.xhtml");
		
		userDealRequest.setTimeStamp(1344568374);
		userDealRequest.setRandomValue(1598632457L);
		userDealRequest.setUin(1598632457);
		userDealRequest.setAccessToken("ad39b7dbd59b87cda827223c0e520d6f");
		userDealRequest.setAppOAuthID("700042973");
		
		userDealRequest.setFormat("xml");
		
		List<UserDeal> userDeals = new ArrayList<UserDeal>();
		UserDeal u1 = new UserDeal();
		u1.setOrderId("111");
		u1.setOrderDate("1111-11-11");
		u1.setOrderAmount("11");
		u1.setPayAmount("11");
		u1.setOpenId("11");
		u1.setSalesType("11");
		u1.setShopCode("1111");
		u1.setSalesCode("11");
		u1.setTotalQty("1111");
		Extension dealExtension = new Extension("d_a1","d_b1");
		u1.setDealExtension(dealExtension);
		ItemData itemData = new ItemData();
		itemData.setItemId("11");
		itemData.setItemName("11-11");
		itemData.setItemPrice("11111");
		itemData.setItemQty("1111");
		Extension itemExtension = new Extension("t_a1","t_b1");
		itemData.setItemExtension(itemExtension);
		u1.setItemData(itemData);
		userDeals.add(u1);
		UserDeal u2 = new UserDeal();
		u2.setOrderId("222");
		u2.setOrderDate("2222-22-22");
		u2.setOrderAmount("22");
		u2.setPayAmount("22");
		u2.setOpenId("22");
		u2.setSalesType("22");
		u2.setShopCode("2222");
		u2.setSalesCode("22");
		u2.setTotalQty("2222");
		Extension dealExtension2 = new Extension("d_a2","d_b2");
		u2.setDealExtension(dealExtension2);
		ItemData itemData2 = new ItemData();
		itemData2.setItemId("22");
		itemData2.setItemName("22-22");
		itemData2.setItemPrice("22222");
		itemData2.setItemQty("2222");
		Extension itemExtension2 = new Extension("t_a2","t_b2");
		itemData2.setItemExtension(itemExtension2);
		u2.setItemData(itemData2);
		userDeals.add(u2);
		userDealRequest.setUserDeals(userDeals);
		HashMap<String, String> paramMap = userDealRequest.getParamMap();
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,Constants.SECRET_OAUTH_KEY));
	}

}
