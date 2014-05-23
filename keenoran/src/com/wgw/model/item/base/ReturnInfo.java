package com.wgw.model.item.base;

import java.util.List;

import lombok.Data;

public @Data class ReturnInfo {
	private List<ApiStockBO> successList;//处理成功列表
	private List<ApiStockErrorRet> failList;//处理失败列表

}
