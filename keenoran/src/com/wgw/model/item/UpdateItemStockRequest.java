package com.wgw.model.item;

import java.util.HashMap;

import lombok.Getter;

import com.wgw.model.base.SysLevelParams;
import com.wgw.util.StringUtils;
/**
 * 
 * @ClassName: UpdateItemStockRequest 
 * @Description: 微购物修改商品单库存数量和价格API
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月23日 上午10:52:44 
 *
 */
public class UpdateItemStockRequest extends SysLevelParams{
	private HashMap<String, String> paramMap = null;
	
	public UpdateItemStockRequest(){
		paramMap = super.getParamMap();
	}
	
	
	@Getter private int subUin;//工号的uin,如果是主号，和sellerUin保持一致
	@Getter private String itemId;//商品id【必填】
	@Getter private long skuId;//库存唯一ID【必填】
	@Getter private int num;//库存价格,单位分[>0]【数量和价格必填之一】
	@Getter private int price;

	public HashMap<String, String> getParamMap() {
		return paramMap;
	}
	public void setSubUin(int subUin) {
		if (StringUtils.isNumeric(subUin)) {
			paramMap.put("subUin", subUin+"");
		}
		this.subUin = subUin;
	}
	public void setItemId(String itemId) {
		if (!StringUtils.isEmpty(itemId)) {
			paramMap.put("itemId", itemId);
		}
		this.itemId = itemId;
	}
	public void setSkuId(long skuId) {
		if (StringUtils.isNumeric(skuId)) {
			paramMap.put("skuId", skuId+"");
		}
		this.skuId = skuId;
	}
	public void setNum(int num) {
		if (StringUtils.isNumeric(num)) {
			paramMap.put("num", num+"");
		}
		this.num = num;
	}
	public void setPrice(int price) {
		if (StringUtils.isNumeric(price)) {
			paramMap.put("price", price+"");
		}
		this.price = price;
	}
	
	

	
}
