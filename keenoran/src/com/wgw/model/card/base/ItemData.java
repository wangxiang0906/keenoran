package com.wgw.model.card.base;

import lombok.Data;

/**
 * 
 * @ClassName: ItemData 
 * @Description: 订单数据项
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月22日 下午4:05:43 
 *
 */
public @Data class ItemData {
	
	private String itemId;//商品货号
	private String itemName;//商品名称
	private String itemPrice;//商品价格（分）
	private String itemQty;//购买件数
	private Extension itemExtension;//扩展信息

}
