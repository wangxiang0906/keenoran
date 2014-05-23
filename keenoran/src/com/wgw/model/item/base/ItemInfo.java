package com.wgw.model.item.base;

import java.util.List;

/**
 * 
 * @ClassName: ItemInfo 
 * @Description: 发布商品时的处理结果
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午4:15:36 
 *
 */
public class ItemInfo {
	private int version;//版本号, version要为小写
	private String itemId;//商品id,该ID是作为发布商品成功后由平台生成,作为该商品在平台的唯一标识
	private List<ApiStockBO> stockNew;//新的库存相关
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public List<ApiStockBO> getStockNew() {
		return stockNew;
	}
	public void setStockNew(List<ApiStockBO> stockNew) {
		this.stockNew = stockNew;
	}
	
	

}
