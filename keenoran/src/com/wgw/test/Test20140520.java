package com.wgw.test;

import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wgw.model.item.AddItemRequest;
import com.wgw.util.URLUtil;

/**
 * 
 * @ClassName: Test20140520 
 * @Description:  
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月20日 上午9:59:03 
 *
 */
public class Test20140520 {
	
	
	@Before
	public void before(){
		System.out.println("----------start---------");
	}
	
	@After
	public void end(){
		System.out.println("----------end---------");
	}
	
	@Test
	public void testItemAdd() throws Exception{
		AddItemRequest itemAdd = new AddItemRequest();
		itemAdd.setHost("http://api.weigou.qq.com");
		itemAdd.setUri("/wgwitem/wgAddItem.xhtml");
		
		itemAdd.setTimeStamp(1344568374);
		itemAdd.setRandomValue(1598632457L);
		itemAdd.setUin(1598632457);
		itemAdd.setAccessToken("ad39b7dbd59b87cda827223c0e520d6f");
		itemAdd.setAppOAuthID("700042973");
		
		itemAdd.setFormat("json");
		itemAdd.setSubUin(1280863473);
		itemAdd.setLeafClassId(1280863473);
		itemAdd.setClassAttr("ABCD");
		itemAdd.setPrice_bin("151515A");
		itemAdd.setStockstr("stockstr");
		
		itemAdd.setUploadPicInfo1("uploadPicInfo1");
		
		itemAdd.setMarketPrice("12569A");
		
		HashMap<String, String> paramMap = itemAdd.getParamMap();
		
		System.out.println(URLUtil.makeCompleteURL(paramMap,"hdUMwmU4P5jQtHpC"));
	}
	
	@Test
	public void testWrapper() throws Exception{
		AddItemRequest itemAdd = new AddItemRequest();
		//http://api.weigou.qq.com/wgwitem/wgAddItem.xhtml
		itemAdd.setHost("http://api.weigou.qq.com");
		itemAdd.setUri("/wgwitem/wgAddItem.xhtml");
		
		itemAdd.setAppOAuthID("700042973");
		itemAdd.setAccessToken("ad39b7dbd59b87cda827223c0e520d6f");
		itemAdd.setRandomValue(1598632457L);
		itemAdd.setUin(1598632457);
		itemAdd.setTimeStamp(1344568374);
		
		itemAdd.setFormat("json");
		
		itemAdd.setCity((short)1012);
		itemAdd.setBuyLimit(12569);
		itemAdd.setSubUin(1280863473);
		
		HashMap<String, String> paramMap = itemAdd.getParamMap();
		
		//CompleteURL completeURL = SignatureUtil.getSignature(paramMap,"hdUMwmU4P5jQtHpC");
		System.out.println(URLUtil.makeCompleteURL(paramMap,"hdUMwmU4P5jQtHpC"));
	}
	
	
	@Test
	public void testEncode() throws Exception{
		HashMap<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("appOAuthID", "700042973");
		paramMap.put("timeStamp", "1344568374452");
		paramMap.put("accessToken", "ad39b7dbd59b87cda827223c0e520d6f");
		paramMap.put("charset", "gbk");
		paramMap.put("format", "xml");
		paramMap.put("randomValue", "58095");
		paramMap.put("uin", "1280863473");
		paramMap.put("sellerUin", "1280863473");
		
		
		/*CompleteURL completeURL = SignatureUtil.getSignature(paramMap, "/deal/sellerSearchDealList.xhtml","hdUMwmU4P5jQtHpC");
		System.out.println(completeURL.getSign()+completeURL.getParamsBeforeEncoding());*/
		/*String doSecret = SignatureUtil.getSignature(paramMap, "/deal/sellerSearchDealList.xhtml","hdUMwmU4P5jQtHpC");
		System.out.println(doSecret);
		doSecret = URLEncoder.encode(doSecret, "UTF-8");
		System.out.println(doSecret);*/
	}
}

