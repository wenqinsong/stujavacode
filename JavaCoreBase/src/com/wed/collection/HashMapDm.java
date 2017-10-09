package com.wed.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDm {
@SuppressWarnings("all")
	public static void main(String[] args) {
		Map zoo = new HashMap();
		
		zoo.put("wh","武汉动物园" );
		zoo.put("SH", "上海动物园");
		System.out.println("map元素如下：");
		System.out.println(zoo);
		System.out.println("用key获取的元素如下：");
		System.out.println(zoo.get("wh"));
		zoo.remove("wh");
		System.out.println(zoo);
	}

}
