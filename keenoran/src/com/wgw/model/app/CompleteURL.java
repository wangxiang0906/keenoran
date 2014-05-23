package com.wgw.model.app;
/**
 * 
 * @ClassName: CompleteURL 
 * @Description: 构造一个完整的URL需要的全部字段 
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月20日 下午3:33:24 
 *
 */
public class CompleteURL {
	private String host;//主机地址
	
	private String uri;//不带参数的url出去host的部分
	
	private String paramsBeforeEncoding;//编码前的参数串,构造时需要
	
	private String paramsAfterEncoding;//编码后的字符串,产生sign时需要,作为被加密对象

	private String secretKey;//生成sign的秘钥

	private String sign;//编码后的sign,用于装配完整的URL

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getParamsBeforeEncoding() {
		return paramsBeforeEncoding;
	}

	public void setParamsBeforeEncoding(String paramsBeforeEncoding) {
		this.paramsBeforeEncoding = paramsBeforeEncoding;
	}

	public String getParamsAfterEncoding() {
		return paramsAfterEncoding;
	}

	public void setParamsAfterEncoding(String paramsAfterEncoding) {
		this.paramsAfterEncoding = paramsAfterEncoding;
	}
	
	
	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
	
	
	
}
