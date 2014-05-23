package com.wgw.model.item;

import lombok.Getter;
import lombok.Setter;

import com.wgw.model.base.BaseResponse;
import com.wgw.model.item.base.ReturnInfo;

public class UpdateItemMultiStockResponse extends BaseResponse{
	
	
	@Getter @Setter private ReturnInfo returnInfo;//处理结果
	
	
}
