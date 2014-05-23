package com.wgw.model.item.base;

import lombok.Data;

public @Data class Stock {
	
	private String itemId;//商品ID
	private String attr;//库存属性串,如:颜色:白|尺寸:XL
	private String desc;//描述信息
	private String stockId;//商家自定义库存编码
	private int sellerUin;//卖家Uin,即店铺QQ,主号uin
	private int soldNum;//卖家Uin,即店铺QQ,主号uin	
	private int price;//库存价格,单位：分
	private int num;//库存数量
	private long skuId;//skuId,该ID作为库存发布成功后平台生成的库存唯一标识,作为后续修改库存时的主键
	private int status;//库存状态:1-仓库中,2-上架销售中,9-预删除,64-自定义时间上架,6-售完
	private String saleAttr;//销售属性串,即attr的数字化表示,参考商品库存属性工具
	private String pic;//库存图片链接,指拍拍本地图片库地址
	private String specAttr;//库存特殊属性串,参考商品库存属性工具

}
