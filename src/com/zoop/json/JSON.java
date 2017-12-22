package com.zoop.json;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JSON {

	//将对象转成json字符串
	@SuppressWarnings("unchecked")
	public static String toJSONString(Object obj) {
		if(obj == null) {
			return null;
		}
		String classname = obj.getClass().getName();
		if(classname.contains("java.lang")) {
			return obj.toString();
		}
		if(classname.equals("java.util.HashMap") || classname.equals("java.util.Map")) {
			Map<String, Object> map = (Map<String, Object>)obj;
			Set<Map.Entry<String, Object>> entrySet = map.entrySet();
			StringBuilder sb = new StringBuilder("{");
			for(Map.Entry<String, Object> entry : entrySet) {
				sb.append("\""+entry.getKey()+"\":"+toJSONString(entry.getValue())+",");
			}
			sb.delete(sb.length()-1, sb.length());//去掉逗号
			sb.append("}");
			return sb.toString();
		}
		if(classname.equals("java.util.ArrayList") || classname.equals("java.util.List")) {
			StringBuilder sb = new StringBuilder("[");
			List<Object> list = (List<Object>)obj;
			for(int i = 0; i < list.size(); i++) {
				sb.append(toJSONString(list.get(i))).append(",");
			}
			sb.delete(sb.length()-1, sb.length());
			sb.append("]");
			return sb.toString();
		}
		Field[] fields = obj.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder("{");
		for(Field field : fields) {
			field.setAccessible(true);
			try {
				sb.append("\""+field.getName()+"\":"+toJSONString(field.get(obj))).append(",");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		sb.delete(sb.length()-1, sb.length());
		sb.append("}");
		return sb.toString();
	}
	
}
