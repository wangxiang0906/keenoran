package com.wgw.model.card.base;

import lombok.Data;
/**
 * 
 * @ClassName: UserAccount 
 * @Description: 待同步会员账户信息实体
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月22日 下午1:51:12 
 *
 */
public @Data class UserAccount {
	
	private String openId;//买家微信侧标识
	private String cost;//消费金额
	private String point;//积分
	private String pointVersion;//信息版本

}
