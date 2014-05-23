package com.wgw.util;

import java.util.Date;

/**
 * 
 * @ClassName: SystemUtil 
 * @Description: 提供系统需要的工具
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午3:26:23 
 *
 */
public class SystemUtil {
	
	/**
	 * 将时间戳转换为标准日期
	 * @param timeStamp
	 * @return
	 */
	public static Date timeStamp2Date(long timeStamp){
		return new Date(timeStamp*1000L);
	}
	
	//将当前时间转换为时间戳
	public static long now2TimeStamp(){
		return (new Date().getTime()/1000);
	}
	
	//获取一个十位的随机数
	public static long getRandom(){		
		return (long)(Math.random()*100000000);
	}

}
