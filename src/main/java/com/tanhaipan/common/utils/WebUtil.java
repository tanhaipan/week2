package com.tanhaipan.common.utils;

public class WebUtil {
	/**
	 * 获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 
	 */
	public boolean getString(HttpServletRequest request, String name, String defaultValue){
		if (name.length()==0) {
			return false;
		}
		
	    return true;
	}
	/**
	 * 获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值
	 */
	public int getInt(String a){
		
	    if (a.length()==0||a!="/[0-9] /") {
			return 0;
		}
	    return 0;
	}
	/**
	 * 获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false
	 * 
	 */
	public boolean getBoolean(String src){
	  if (src!=null && src.length()!=0) {
		return true;
	}
	  return false;
	}
	/**
	 * ：获取当前请求地址，注意参数不能丢 
	 */
	public String getUrl(HttpServletRequest request){
	    return request.toString();
	    
	}
	/**
	 * 给定一个Cookie名获得取Cookie值
	 */
	public String getCookieValue(String cookie){
	    //实现代码
		String cookieValue = getCookieValue(cookie);
		return cookieValue;
	}

}
