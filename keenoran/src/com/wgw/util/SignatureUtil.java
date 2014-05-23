package com.wgw.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.wgw.constant.Constants;
import com.wgw.model.app.CompleteURL;

/**
 * 
 * @ClassName: SignatureUtil 
 * @Description: 使用最新的sign签名算法为参数串提供签名值
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午5:38:05 
 *	签名值 sign 是将请求源串以及密钥根据一定签名方法生成的签名值，用来提高传输过程参数的防篡改性
 */
public class SignatureUtil {
	
	private static final String MAC_NAME = "HmacSHA1";  
    private static final String ENCODING = "UTF-8"; 
	
	public static CompleteURL getSrcString(HashMap<String, String> paramMap) throws UnsupportedEncodingException {
		CompleteURL completeURL = new CompleteURL();
		
		Map<String, String> sortedParams = new TreeMap<String, String>(paramMap);
		Set<Entry<String, String>> entrys = sortedParams.entrySet();
	 
		// 遍历排序后的字典，将所有参数按"key=value"格式拼接在一起
		StringBuilder basestring = new StringBuilder();
		for (Entry<String, String> param : entrys) {
			if (param.getKey() == Constants.HOST) {
				completeURL.setHost(param.getValue());
				continue;
			}
			if (param.getKey() == Constants.URI) {
				completeURL.setUri(param.getValue());
				continue;
			}
			basestring.append(param.getKey()).append("=").append(param.getValue()).append("&");
		}
		String destStr = basestring.substring(0, basestring.length()-1);
		//System.out.println("编码前的源串:  "+destStr);
		completeURL.setParamsBeforeEncoding(destStr);
		destStr = URLEncoder.encode(destStr,ENCODING);
		String URI = paramMap.get(Constants.URI);
		URI = URLEncoder.encode(URI,ENCODING);
		destStr = "GET&"+URI+"&"+destStr;
		System.out.println("用于加密的源串:  "+destStr);
		//destStr = destStr.replaceAll("/*", "%2A").replace("+", "%2B").replace(" ", "%20");
		completeURL.setParamsAfterEncoding(destStr);
		return completeURL;
	}
	
	
	public static CompleteURL getSignature(HashMap<String, String> paramMap,String secretOAuthKey) throws Exception{
		//根据map结构和URI构造源串
		CompleteURL completeURL = SignatureUtil.getSrcString(paramMap);
		secretOAuthKey = secretOAuthKey + "&"; 
		completeURL.setSecretKey(secretOAuthKey);
		byte[] data=secretOAuthKey.getBytes(ENCODING);
		//根据给定的字节数组构造一个密钥,第二参数指定一个密钥算法的名称
		SecretKey secretKey = new SecretKeySpec(data, MAC_NAME); 
		//生成一个指定 Mac 算法 的 Mac 对象
		Mac mac = Mac.getInstance(MAC_NAME); 
		//用给定密钥初始化 Mac 对象
		mac.init(secretKey);  
        String srcStr = completeURL.getParamsAfterEncoding();
		byte[] text = srcStr.getBytes(ENCODING); 
		//完成 Mac 操作 
		text = mac.doFinal(text);
		//使用codec库进行编码处理
		text= Base64.encodeBase64(text);
		String signStr = new String(text);
		System.out.println("签名原文:  "+signStr);
		String sign = "?sign="+URLEncoder.encode(signStr, "UTF-8")+"&";
		completeURL.setSign(sign);
        return completeURL;  
	}
	
}
