package com.tanhaipan.common.utils;

import java.util.List;
import java.util.Map;

public class CollectionUtil {
	/**
	 * 判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值
	 */
	public boolean notEmpty(List<?> list){
	   return list==null|| list.isEmpty();
	}
	/**
	 * 判断Map集合是否有元素，对象为空或对象中没有元素都算没值 
	 */
	public boolean notEmpty(Map<?, ?> map){
	    return map==null ||map.isEmpty();
	}


}
