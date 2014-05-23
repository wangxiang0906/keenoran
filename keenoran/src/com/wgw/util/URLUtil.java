package com.wgw.util;

import java.util.HashMap;
import com.wgw.model.app.CompleteURL;
/**
 * 
 * @ClassName: URLUtil 
 * @Description: 装配一个完整URL全部参数
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月20日 下午3:43:22 
 *
 */
public class URLUtil {
	public static String makeCompleteURL(HashMap<String, String> paramMap,String secretOAuthKey) throws Exception{
		CompleteURL completeURL = SignatureUtil.getSignature(paramMap, secretOAuthKey);
		StringBuffer sb = new StringBuffer();
		String host = completeURL.getHost();
		String uri = completeURL.getUri();
		String sign = completeURL.getSign();
		String paramsBeforeEncoding = completeURL.getParamsBeforeEncoding();
		System.out.println("host =  "+host);
		System.out.println("uri =  "+uri);
		System.out.println("sign =  "+sign);
		System.out.println("paramsBeforeEncoding =  "+paramsBeforeEncoding);
		sb.append(host).append(uri).append(sign).append(paramsBeforeEncoding);
		return sb.toString();
	}
	

}
