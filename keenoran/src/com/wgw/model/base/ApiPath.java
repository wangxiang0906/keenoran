package com.wgw.model.base;

import java.util.HashMap;

import com.wgw.constant.Constants;
import com.wgw.util.StringUtils;

/**
 * 
 * @ClassName: ApiPath 
 * @Description: 请求路径的API路径信息
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午6:23:27 
 *
 */
public class ApiPath {
	
	private HashMap<String, String> paramMap = null;
	
	public ApiPath(){
		paramMap = new HashMap<String, String>();
	}
	
	private String host;//主机域名
	private String uri;//URI,不含host的api路径
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		if (!StringUtils.isEmpty(host)) {
			paramMap.put(Constants.HOST, host);
		}
		this.host = host;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		if (!StringUtils.isEmpty(uri)) {
			paramMap.put(Constants.URI, uri);
		}
		this.uri = uri;
	}
	
	public HashMap<String, String> getParamMap() {
		return paramMap;
	}
}
