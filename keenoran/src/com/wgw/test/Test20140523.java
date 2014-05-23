package com.wgw.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.wgw.constant.Constants;
import com.wgw.model.item.GetItemMultiStockRequest;
import com.wgw.model.item.UpdateItemMultiStockRequest;
import com.wgw.model.item.UpdateItemStockRequest;
import com.wgw.model.item.base.ItemStock;
import com.wgw.util.SystemUtil;
import com.wgw.util.URLUtil;


public class Test20140523 {
	
	@Test
	public void testGetItemMultiStock() throws Exception{
		GetItemMultiStockRequest getItemMultiStock = new GetItemMultiStockRequest();
		
		getItemMultiStock.setHost("http://api.weigou.qq.com");
		getItemMultiStock.setUri("/wgwitem/wgGetItemMultiStock.xhtml");
		
		getItemMultiStock.setTimeStamp(SystemUtil.now2TimeStamp());
		getItemMultiStock.setRandomValue(SystemUtil.getRandom());
		getItemMultiStock.setUin(Constants.UIN);
		getItemMultiStock.setAccessToken(Constants.ACCESS_TOKEN);
		getItemMultiStock.setAppOAuthID(Constants.APP_OAUTH_ID);
		
		getItemMultiStock.setFormat("xml");
		getItemMultiStock.setSubUin(Constants.UIN);
		getItemMultiStock.setItemId("123");
		
		HashMap<String, String> paramMap = getItemMultiStock.getParamMap();
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,Constants.SECRET_OAUTH_KEY));		
		
	}
	
	
	@Test
	public void TestNow(){
		System.out.println(SystemUtil.now2TimeStamp());
	}
	
	@Test
	public void testUpdateItemMultiStock() throws Exception{
		UpdateItemMultiStockRequest updateItemMultiStock = new UpdateItemMultiStockRequest();
		updateItemMultiStock.setHost("http://api.weigou.qq.com");
		updateItemMultiStock.setUri("/wgwitem/wgUpdateItemMultiStock.xhtml");
		
		updateItemMultiStock.setTimeStamp(SystemUtil.now2TimeStamp());
		updateItemMultiStock.setRandomValue(SystemUtil.getRandom());
		updateItemMultiStock.setUin(Constants.UIN);
		updateItemMultiStock.setAccessToken(Constants.ACCESS_TOKEN);
		updateItemMultiStock.setAppOAuthID(Constants.APP_OAUTH_ID);
		
		updateItemMultiStock.setFormat("json");
		
		updateItemMultiStock.setSubUin(new Long(Constants.UIN).intValue());
		updateItemMultiStock.setItemId("123123123");
		
		List<ItemStock> newData = new ArrayList<ItemStock>();
		ItemStock i1 = new ItemStock();
		i1.setItemId(11);
		i1.setAttr("11");
		i1.setDesc("11");
		i1.setSellerUin(11);
		i1.setPrice(11);
		i1.setNum(11);
		i1.setSkuId(11);
		i1.setStockId(11);
		i1.setStatus(1);
		i1.setSaleAttr("11");
		i1.setSpecAttr("11");
		newData.add(i1);
		
		ItemStock i2 = new ItemStock();
		i2.setItemId(22);
		i2.setAttr("22");
		i2.setDesc("22");
		i2.setSellerUin(22);
		i2.setPrice(22);
		i2.setNum(22);
		i2.setSkuId(22);
		i2.setStockId(22);
		i2.setStatus(2);
		i2.setSaleAttr("22");
		i2.setSpecAttr("2");
		newData.add(i2);
		
		
		updateItemMultiStock.setNewData(newData);
		
		HashMap<String, String> paramMap = updateItemMultiStock.getParamMap();
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,Constants.SECRET_OAUTH_KEY));
		
	}
	
	
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

