package com.zoop.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String []args) {
		List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "id4545");
		map.put("name", "name4545");
		map.put("code", "code4545");
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("id", "id84456");
		map1.put("name", "name548456");
		map1.put("code", "code5641");
		list.add(map);list.add(map1);
		System.out.println(JSON.toJSONString(list));
	}
	
}
