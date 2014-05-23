package com.wgw.model.card.base;

import lombok.Data;

/**
 * 
 * @ClassName: UserDeal 
 * @Description: 线下订单实体
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月22日 下午4:06:04 
 *
 */
public @Data class UserDeal {
	
	private String orderId;//订单编号
	private String orderDate;//付款时间
	private String orderAmount;//订单金额（分）
	private String payAmount;//付款金额（分）
	private String openId;//买家微信侧标识
	private String salesType;//支付方式
	private String shopCode;//购买门店代码
	private String salesCode;//关联销售员代码
	private String totalQty;//商品件数
	private Extension dealExtension;//订单扩展信息
	private ItemData itemData;//订单商品详细信息

}
