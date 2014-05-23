package com.wgw.model.base;
/**
 * 
 * @ClassName: BaseReturnResult 
 * @Description: 请求返回时最基本的数据,包括错误码和错误信息
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午5:34:34 
 *
 */
public class BaseResponse {
	
	private int errorCode;
	private String errorMessage;//错误信息
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
