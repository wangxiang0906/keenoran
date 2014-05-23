package com.wgw.test.api;

import java.util.HashMap;

import org.junit.Test;

import com.wgw.constant.Constants;
import com.wgw.model.item.AddItemRequest;
import com.wgw.util.SystemUtil;
import com.wgw.util.URLUtil;

public class TestItemAdd {
	
	/**
	 * 测试商品发布接口
	 * @throws Exception
	 */
	@Test
	public void testItemAdd() throws Exception{
		AddItemRequest itemAdd = new AddItemRequest();
		itemAdd.setHost("http://api.weigou.qq.com");
		itemAdd.setUri("/wgwitem/wgAddItem.xhtml");
		
		itemAdd.setTimeStamp(SystemUtil.now2TimeStamp());
		itemAdd.setRandomValue(SystemUtil.getRandom());
		itemAdd.setUin(Constants.UIN);
		itemAdd.setAccessToken(Constants.ACCESS_TOKEN);
		itemAdd.setAppOAuthID(Constants.APP_OAUTH_ID);
		
		itemAdd.setFormat("json");
		itemAdd.setSubUin(Constants.UIN);
		itemAdd.setLeafClassId(1280863473);
		itemAdd.setClassAttr("ABCD");
		itemAdd.setPrice_bin("151515");
		itemAdd.setStockstr("stockstr");
		itemAdd.setUploadPicInfo1("uploadPicInfo1");
		itemAdd.setMarketPrice("12569");
		itemAdd.setCity((short)40004);
		itemAdd.setTitle("15151");
		
		HashMap<String, String> paramMap = itemAdd.getParamMap();
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,Constants.SECRET_OAUTH_KEY));
	}

}
