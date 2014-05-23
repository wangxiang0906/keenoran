package com.wgw.model.base;

import java.util.HashMap;

import com.wgw.util.StringUtils;

/**
 * 
 * @ClassName: SysLevelParam 
 * @Description: 系统级别的请求参数,主要包含重要的鉴权字段和消息的校验字段
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午3:39:35 
 *
 */
public class SysLevelParams extends ApiPath{
	
	private HashMap<String, String> paramMap = null;
	
	public SysLevelParams(){
		paramMap = super.getParamMap();
		format = "json";
		if (!StringUtils.isEmpty(format)) {
			paramMap.put("format", format);
		}
	}
	
	private long timeStamp;//当前的系统时间戳，单位为秒
	private long randomValue; //随机值的整数取值范围    <一亿 && >0.
	private long uin;//合法的QQ号
	private String accessToken;//accessToken与uin一一对应，用于校验单个用户的真实身份
	private String appOAuthID;//appOAuthID对应于接入方平台，可能是一个商家系统或一个第三方应用
	private String sign;//请求包的校验值，防止重要数据被中途篡改，新版sign的算法
	
	private String format = "json"; //用于指定返回格式
	
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		if (StringUtils.isNumeric(timeStamp)) {
			paramMap.put("timeStamp", timeStamp+"");
		}
		this.timeStamp = timeStamp;
	}
	public long getRandomValue() {
		return randomValue;
	}
	public void setRandomValue(long randomValue) {
		if (StringUtils.isNumeric(randomValue)) {
			paramMap.put("randomValue", randomValue+"");
		}
		this.randomValue = randomValue;
	}
	public long getUin() {
		return uin;
	}
	public void setUin(long uin) {
		if (StringUtils.isNumeric(uin)) {
			paramMap.put("uin", uin+"");
		}
		this.uin = uin;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		if (!StringUtils.isEmpty(accessToken)) {
			paramMap.put("accessToken", accessToken);
		}
		this.accessToken = accessToken;
	}
	public String getAppOAuthID() {
		return appOAuthID;
	}
	public void setAppOAuthID(String appOAuthID) {
		if (!StringUtils.isEmpty(appOAuthID)) {
			paramMap.put("appOAuthID", appOAuthID);
		}
		this.appOAuthID = appOAuthID;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		if (!StringUtils.isEmpty(sign)) {
			paramMap.put("sign", sign);
		}
		this.sign = sign;
	}
	
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		if (!StringUtils.isEmpty(format)) {
			paramMap.put("format", format);
		}
		this.format = format;
	}
	
	public HashMap<String, String> getParamMap() {
		return paramMap;
	}
	
}
