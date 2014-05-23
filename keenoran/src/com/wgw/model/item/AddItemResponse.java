package com.wgw.model.item;

import com.wgw.model.base.BaseResponse;
import com.wgw.model.item.base.ItemInfo;

/**
 * 
 * @ClassName: ItemAddReturnResult 
 * @Description: 微购物发布商品时的返回结构 
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午4:12:43 
 *
 */

public class AddItemResponse extends BaseResponse{
	
	private ItemInfo itemInfo;//发布商品处理结果
	private String warnMessage;//商品正常发布了,但根据微购物规则,如果有些告知信息的话,会在这个字段中显示.

	public ItemInfo getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}
	public String getWarnMessage() {
		return warnMessage;
	}
	public void setWarnMessage(String warnMessage) {
		this.warnMessage = warnMessage;
	}
	
}
