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
		User user1 = new User();
		user1.setId("145");
		user1.setName("jjj4564");
		map.put("data", list);
		map.put("token", "kkjgguhighjgh");
		map.put("bean", user1);
		List<User> l1 = new ArrayList<User>();
		User u1 = new User();
		u1.setId("u111");
		u1.setName("ui4545644");
		User u2 = new User();
		u2.setId("u222");
		u2.setName("ui454544");
		l1.add(u1);l1.add(u2);
		map.put("ll", l1);
		System.out.println(JSON.toJSONString(map));
	}
	
}
