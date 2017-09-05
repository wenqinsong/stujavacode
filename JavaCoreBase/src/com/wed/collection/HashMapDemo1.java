package com.wed.collection;

import java.util.HashMap;
import java.util.Map;




public class HashMapDemo1 {
	

	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Map countries = new HashMap();
		
		countries.put("CN","中国");
		countries.put("FR", "法国");
		countries.put("RU", "俄国");
		countries.put("USA", "美国");
		countries.put("US", "英国");
		System.out.println("Map的元素如下：");
		System.out.println(countries);
		
		String country = (String) countries.get("CN");
		System.out.println("Map中共有"+countries.size()+"个国家");
		
		System.out.println("删除元素");
		countries.remove("CN");
		System.out.println(countries);
		
		
		System.out.println("Map中包含FR的key吗？"+countries.containsKey("FR"));
		System.out.println("Map中包含CN的key吗？"+countries.containsKey("CN"));
		System.out.println("Map中包含RU的key吗？"+countries.containsKey("RU"));
		
		System.out.println(countries.keySet());
		
		System.out.println(countries.values());
		
		System.out.println(countries);
	}

}
