package com.wgw.model.item;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

import com.wgw.model.base.SysLevelParams;
import com.wgw.util.StringUtils;

public class GetItemMultiStockRequest extends SysLevelParams{
	
	@Getter @Setter private HashMap<String, String> paramMap = null;
	
	public GetItemMultiStockRequest(){
		paramMap = super.getParamMap();
	}
	
	@Getter private long subUin;//工号的uin，如果是主号，和sellerUin保持一致
	@Getter private String itemId;//商品id【必填】

	public void setSubUin(long subUin) {
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
	
}
