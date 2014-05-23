package com.wgw.model.card;

import lombok.Getter;
import lombok.Setter;

import com.wgw.model.base.BaseResponse;

/**
 * 
 * @ClassName: UserDealResponse 
 * @Description: 同步会员线下订单响应类
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月22日 下午3:04:07 
 *
 */
public class UserDealResponse extends BaseResponse{	
	@Getter @Setter private int succCount;//成功同步数
}
