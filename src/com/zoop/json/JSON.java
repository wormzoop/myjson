package com.zoop.json;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;

public class JSON {

	//将对象转成json字符串
	public static String toJSONString(Object obj) {
		if(obj == null) {
			return null;
		}
		String classname = obj.getClass().getName();
		if(classname.equals("java.util.HashMap")) {
			Map<String, Object> map = (Map<String, Object>)obj;
			Set<Map.Entry<String, Object>> entrySet = map.entrySet();
			StringBuilder sb = new StringBuilder("{");
			for(Map.Entry<String, Object> entry : entrySet) {
				sb.append("\""+entry.getKey()+"\":"+entry.getValue()+",");
			}
			sb.delete(sb.length()-1, sb.length());//去掉逗号
			sb.append("}");
			return sb.toString();
		}
		if(classname.equals("java.util.List")) {
			return "";
		}
		Field[] fields = obj.getClass().getDeclaredFields();
		return "";
	}
	
}
