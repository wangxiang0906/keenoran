package com.wgw.test.api;

import java.util.HashMap;

import org.junit.Test;

import com.wgw.constant.Constants;
import com.wgw.model.item.UpdateItemStockRequest;
import com.wgw.util.URLUtil;

public class TestUpdateItemStock {
	
	@Test
	public void testUpdateItemStock() throws Exception{
		
		UpdateItemStockRequest updateItemStockRequest = new UpdateItemStockRequest();
		updateItemStockRequest.setHost("http://api.weigou.qq.com");
		updateItemStockRequest.setUri("/wgwitem/wgUpdateItemStock.xhtml");
		
		updateItemStockRequest.setTimeStamp(1344568374);
		updateItemStockRequest.setRandomValue(1598632457L);
		updateItemStockRequest.setUin(1598632457);
		updateItemStockRequest.setAccessToken("ad39b7dbd59b87cda827223c0e520d6f");
		updateItemStockRequest.setAppOAuthID("700042973");
		
		updateItemStockRequest.setFormat("xml");
		
		
		updateItemStockRequest.setSubUin(1212121);
		updateItemStockRequest.setItemId("121QQ");
		updateItemStockRequest.setSkuId(15915915959L);
		updateItemStockRequest.setNum(156156);
		updateItemStockRequest.setPrice(123123);
		

		
		HashMap<String, String> paramMap = updateItemStockRequest.getParamMap();
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,Constants.SECRET_OAUTH_KEY));
	
	}

}
