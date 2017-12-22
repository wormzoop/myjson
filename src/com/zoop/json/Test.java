package com.zoop.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String []args) {
		Map<String,Object> map = new HashMap<String, Object>();
		List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("id", "id84456");
		map1.put("name", "name548456");
		map1.put("code", "code5641");
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("id", "id4545");
		map2.put("name", "name4545");
		map2.put("code", "code4545");
		list.add(map1);list.add(map2);
		map.put("data", list);
		System.out.println(JSON.toJSONString(map));
		
	}
	
}
