package com.wgw.model.card;

import java.util.List;

import com.wgw.model.base.BaseResponse;
/**
 * 
 * @ClassName: SyncUserCardReturnResult 
 * @Description: 同步会员卡片信息时返回的实体
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午5:35:45 
 *
 */
public class UserCardResponse extends BaseResponse{
	
	private List<String> failedOpenIds;//同步失败用户的openId列表
	

	public List<String> getFailedOpenIds() {
		return failedOpenIds;
	}

	public void setFailedOpenIds(List<String> failedOpenIds) {
		this.failedOpenIds = failedOpenIds;
	}
	
	
}
