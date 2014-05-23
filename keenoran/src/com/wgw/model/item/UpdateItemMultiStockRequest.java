package com.wgw.model.item;

import java.util.HashMap;
import java.util.List;

import lombok.Getter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wgw.model.base.SysLevelParams;
import com.wgw.model.item.base.ItemStock;
import com.wgw.util.StringUtils;

public class UpdateItemMultiStockRequest extends SysLevelParams{
	private ObjectMapper objectMapper = null;
	
	private HashMap<String, String> paramMap = null;
	
	public UpdateItemMultiStockRequest(){
		paramMap = super.getParamMap();
	}
	
	@Getter private int subUin;//工号的uin，如果是主号，和sellerUin保持一致
	@Getter private String itemId;//商品id【必填】
	@Getter private List<ItemStock> newData;//新库存信息(json数组格式),请参考库存说明,建议每次请求不超过30条

	
	public void setSubUin(int subUin) {
		if (StringUtils.isNumeric(subUin)) {
			paramMap.put("subUin", subUin+"");
		}
		this.subUin = subUin;
	}
	public void setItemId(String itemId) {
		if (!StringUtils.isEmpty(itemId)) {
			paramMap.put("itemId", itemId+"");
		}
		this.itemId = itemId;
	}
	public void setNewData(List<ItemStock> newData) {
		if (newData != null && newData.size() > 0) {
			objectMapper = new ObjectMapper();
			String newDataStr;
			try {
				newDataStr = objectMapper.writeValueAsString(newData);
				System.out.println("------****--------");
				System.out.println(newDataStr);
				System.out.println("------****--------");
				paramMap.put("newData", newDataStr);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		this.newData = newData;
	}
	
	public HashMap<String, String> getParamMap() {
		return paramMap;
	}
}
