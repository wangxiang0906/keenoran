package com.wgw.test;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class TestSys {
	
	@Test
	/**
	 * 显示平台的Java环境属性
	 */
	public void showSystemProperties(){
		//平台提供的Properties封装， @return     the system properties
		Properties pro = System.getProperties();
		//Entry是一个接口，是位于Map接口下的一个子接口
		Set<Entry<Object, Object>> set = pro.entrySet();
		//遍历
		for(Entry<Object, Object> key : set){
			System.out.println(key.getKey()+" = "+key.getValue());
		}
	}

}
