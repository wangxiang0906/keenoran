package com.wgw.util;

/**
 * 
 * @ClassName: StringUtils 
 * @Description: 字符串操作工具 
 * @author 王翔   wangxiang0906@foxmail.com
 * @date 2014年5月19日 下午5:56:23 
 *
 */
public abstract class StringUtils {

	private StringUtils() {}

	/**
	 * 
	 * <ul>
	 * <li>SysUtils.isEmpty(null) = true</li>
	 * <li>SysUtils.isEmpty("") = true</li>
	 * <li>SysUtils.isEmpty("   ") = true</li>
	 * <li>SysUtils.isEmpty("abc") = false</li>
	 * </ul>
	 * 
	 * @param value 
	 * @return true/false
	 */
	public static boolean isEmpty(String value) {
		int strLen;
		if (value == null || (strLen = value.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(value.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 检验一个字符串是否为整数(包括正整数,0,负整数)
	 */
	public static boolean isNumeric(Object obj) {
		if (obj == null) {
			return false;
		}
		char[] chars = obj.toString().toCharArray();
		int length = chars.length;
		if(length < 1)
			return false;
		
		int i = 0;
		if(length > 1 && chars[0] == '-')
			i = 1;
		
		for (; i < length; i++) {
			if (!Character.isDigit(chars[i])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 测试一组字符串是否都不为空
	 */
	public static boolean areNotEmpty(String... values) {
		boolean result = true;
		if (values == null || values.length == 0) {
			result = false;
		} else {
			for (String value : values) {
				result &= !isEmpty(value);
			}
		}
		return result;
	}
	
	/** 
	* 将普通字符串  转换为unicode 字符串
	* @param str 待转字符串 
	* @return unicode 字符串
	*/ 
	public static String string2Unicode(String str) { 
		str = (str == null ? "" : str); 
		String tmp; 
		StringBuffer sb = new StringBuffer(1000); 
		char c; 
		int i, j; 
		sb.setLength(0); 
		for (i = 0; i < str.length(); i++) 
		{ 
			c = str.charAt(i); 
			sb.append("\\u"); 
			j = (c >>>8); //取出高8位 
			tmp = Integer.toHexString(j); 
			if (tmp.length() == 1) 
				sb.append("0"); 
			sb.append(tmp); 
			j = (c & 0xFF); //取出低8位 
			tmp = Integer.toHexString(j); 
			if (tmp.length() == 1) 
				sb.append("0"); 
			sb.append(tmp); 
		} 
		return sb.toString(); 
	}
	
	/** 
	* 将unicode 字符串 转换为普通的字符串
	* @param str 待转字符串 
	* @return 普通字符串 
	*/ 
	public static String unicode2String(String str){ 
		str = (str == null ? "" : str); 
		if (str.indexOf("\\u") == -1)//如果不是unicode码则原样返回 
			return str; 

		StringBuffer sb = new StringBuffer(1000); 

		for (int i = 0; i < str.length() - 6;) { 
			String strTemp = str.substring(i, i + 6); 
			String value = strTemp.substring(2); 
			int c = 0; 
			for (int j = 0; j < value.length(); j++) { 
				char tempChar = value.charAt(j); 
				int t = 0; 
				switch (tempChar) { 
				case 'a': 
					t = 10; 
					break; 
				case 'b': 
					t = 11; 
					break; 
				case 'c': 
					t = 12; 
					break; 
				case 'd': 
					t = 13; 
					break; 
				case 'e': 
					t = 14; 
					break; 
				case 'f': 
					t = 15; 
					break; 
				default: 
					t = tempChar - 48; 
					break; 
				} 
				c += t * ((int) Math.pow(16, (value.length() - j - 1))); 
			} 
			sb.append((char) c);
			i = i + 6; 
		} 
		return sb.toString(); 
	}
}
