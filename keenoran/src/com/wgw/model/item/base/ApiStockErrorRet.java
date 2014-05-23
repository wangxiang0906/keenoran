package com.wgw.model.item.base;

import lombok.Data;


public @Data class ApiStockErrorRet {
	private Stock stock;//库存信息
	private int errorCode;//错误码
	private String errorMsg;//错误信息
}
