package com.wgw.test;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wgw.model.base.SysLevelParams;
import com.wgw.model.item.AddItemRequest;
import com.wgw.util.StringUtils;
import com.wgw.util.SystemUtil;

/**
 * 
 * @ClassName: Test 
 * @Description: 
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午3:03:04 
 *
 */
public class Test20140519 {
	
	@Test
	public void testRandom(){
		System.out.println("1."+new SysLevelParams().getRandomValue());
		System.out.println("2."+new SysLevelParams().getRandomValue());
		System.out.println("3."+new SysLevelParams().getRandomValue());
	}
	
	@Test
	public void testU2S(){
		String str = "\u738b\u7fd4";
		System.out.println(StringUtils.unicode2String(str));
		str = "\u0062\u0061\u0062";
		System.out.println(StringUtils.unicode2String(str));
	}
	
	@Test
	public void testS2U(){
		String str = "bab";
		System.out.println(StringUtils.string2Unicode(str));
		str = "王翔";
		System.out.println(StringUtils.string2Unicode(str));
	}
	
	
	@Test
	public void testNumeric(){
		String i = "0";
		System.out.println(StringUtils.isNumeric(i));
		i = "0.1";
		System.out.println(StringUtils.isNumeric(i));
		i = "159.6";
		System.out.println(StringUtils.isNumeric(i));
		i = "-123.3";
		System.out.println(StringUtils.isNumeric(i));
		i = "-123";
		System.out.println(StringUtils.isNumeric(i));

	}
	
	@Test
	public void testEmpty(){
		String str = null;
		System.out.println(StringUtils.isEmpty(str));
		str = "";
		System.out.println(StringUtils.isEmpty(str));
		str = " ";
		System.out.println(StringUtils.isEmpty(str));
		str = "  ";
		System.out.println(StringUtils.isEmpty(str));
		str = " A ";
		System.out.println(StringUtils.isEmpty(str));
	}
	
	@Before
	public void before(){
		System.out.println("----------Begin Running------------");
	}
	@After
	public void after(){
		System.out.println("----------End Running------------");
	}
	
	@Test
	public void testTimeStamp(){
		Date date1 = new Date();
		System.out.println(date1);
		long timeStamp1 = date1.getTime();
		System.out.println(timeStamp1);
		Date date = new Date(timeStamp1);
		System.out.println(date);
	}
	
	@Test
	public void testUtils() {
		//注意，参数中携带的时间戳单位是s,不是ms.
		long timeStamp = (new Date().getTime())/1000L;
		System.out.println(SystemUtil.timeStamp2Date(timeStamp));
	}
	
	@Test
	public void testExtents(){
		AddItemRequest itemAddReqParams = new AddItemRequest();
		itemAddReqParams.setAppOAuthID("123345345");
		System.out.println(itemAddReqParams.getAppOAuthID()); 
	}
	
	
	
	
}

