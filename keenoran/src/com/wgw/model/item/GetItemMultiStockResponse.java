package com.wgw.model.item;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.wgw.model.base.BaseResponse;
import com.wgw.model.item.base.Stock;

public class GetItemMultiStockResponse extends BaseResponse{
	@Getter @Setter private List<Stock> newData;//库存信息(json数组格式)
}
