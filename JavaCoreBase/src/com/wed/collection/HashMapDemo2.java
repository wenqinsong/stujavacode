package com.wed.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
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
		
		Set entrys = countries.entrySet();
		
		System.out.println("使用foreach遍历：");
		for (Object object : entrys) {
			System.out.println(object);
		}
		
		Set keys = countries.keySet();
		Iterator iterator =keys.iterator();
		System.out.println("使用迭代器遍历：");
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println(key);
			String value =(String) countries.get(key);
			System.out.println("----"+value);
			System.out.println();
		}

	}

}
