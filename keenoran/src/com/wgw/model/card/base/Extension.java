package com.wgw.model.card.base;

import lombok.Data;
/**
 * 
 * @ClassName: Extension 
 * @Description: 扩展类
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月22日 下午4:05:09 
 *
 */

public @Data class Extension {
	
	public Extension(){}
	
	public Extension(String keya,String keyb){
		this.keya = keya;
		this.keyb = keyb;
	}
	
	private String keya;
	private String keyb;
}
