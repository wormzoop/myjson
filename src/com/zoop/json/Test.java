package com.zoop.json;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String []args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "id4545");
		map.put("name", "name4545");
		map.put("code", "code4545");
		System.out.println(JSON.toJSONString(map));
	}
	
}
