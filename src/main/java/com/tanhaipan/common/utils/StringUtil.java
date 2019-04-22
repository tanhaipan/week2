package com.tanhaipan.common.utils;

public class StringUtil {
	/**
	 * 判断源字符串是否有值，空引号(空白字符串)也算没值
	 * 
	 */
	public boolean hasLength(String src){
	    if (src==null||src=="") {
			return false;
		}
	    return true;
	}
	/**
	 * 判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	 */
	public boolean hasText(String src){
	   if (src==null || src=="") {
		return false;
	}
	   if (src.trim()=="") {
		return false;
	}
	   return true;
	}
	/**
	 * 判断是否为手机号码 (5分)
	 */
	public boolean isMobile(String src){
		
	   if (src=="/^1[3457] {10} /") {
		return true;
	}
	   return false;
	}
	/**
	 * 判断是否为邮箱
	 */
	public boolean isEmail(String src){
	   if (src=="/[a-zA-Z] {4,6} /") {
		return true;
	}
	   return false;
	}
	/**
	 * 反转字符串，例如参数值是“abcdefg”，则输出“gfedcba”
	 */
	public String reverse(String src){
		
	    String string = src.substring(0);
	    StringBuilder builder = new StringBuilder();
	
	   for (int i = 0; i < string.length(); i++) {
		builder.append(string);
	}
	   return builder.toString(); 
	    
	}
	
	
	
}
