package com.wgw.model.item.base;

import lombok.Data;

public @Data class ItemStock {
	
	private int itemId;//商品ID,发布商品时不用填,修改时必填
	private String attr;//商品库存属性串,例如:颜色:白色|尺码:L
	private String desc;//库存描述信息
	private int sellerUin;//卖家号,即鉴权参数里的主号uin,发布商品时不用填,修改时必填
	private int price;//库存价格,单位：分,必填
	private int num;//库存数量,必填
	private int skuId;//库存唯一标识,新增库存时不需要,修改删除时必填,该字段的值可通过发布商品成功后返回,或者通过查询商品库存信息返回
	private int stockId;//商家库存编码,商户可通过该字段自定义库存编码,和自身库存对应起来
	private int status;//库存状态码,必填:1-[IS_IN_STORE:仓库中],2-[IS_FOR_SALE:上架销售中],9-[IS_PRE_DELETE:预删除],64-[IS_SALE_ON_TIME:自定义时间上架],6-[IS_SOLD_OUT:售完]
	private String saleAttr;//销售属性串,即attr的数字化表示,该字段可借助商品库存工具生成: 例如123:456
	private String specAttr;//

}
