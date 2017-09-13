package com.wen.enumdemo;

import java.util.EnumMap;
import java.util.Map.Entry;

import sun.print.resources.serviceui;
@SuppressWarnings("all")
public class Tesst {

	public static void main(String[] args) {
		// //遍历枚举的所有实例
		// System.out.println("输出SeasonEnum：");
		// for (SeaseonEnum se : SeaseonEnum.values()) {
		// System.out.println(se);
		// se.printSelf();
		//
		//
		// }

		System.out.println("输出WeekEnum2:");
		for (WeekEnum2 we : WeekEnum2.values()) {
			System.out.println(we);
			System.out.println(we.name() + "------" + we.ordinal() + ",是否休息:" + we.isRest());

		}

		System.out.println("输出季节:");
		for (SeaseonEnum se : SeaseonEnum.values()) {
			System.out.println(se);
			se.printSelf();

		}

		System.out.println("-----------------------");
		SeaseonEnum seaseonEnum = SeaseonEnum.SPRING;
		switch (seaseonEnum) {

		case SPRING:
			printSeason(seaseonEnum);
			break;
		case SUMMER:
			printSeason(seaseonEnum);
			break;
		case AUTUMN:
			printSeason(seaseonEnum);
			break;
		case WINTER:
			printSeason(seaseonEnum);
			break;

		default:
			break;
		}

		System.out.println("EnumMap:");
		EnumMap<WeekEnum2, String> weekMap = new EnumMap(WeekEnum2.class);
		weekMap.put(WeekEnum2.MON, "一");
		weekMap.put(WeekEnum2.TUE, "二");
		weekMap.put(WeekEnum2.WED, "三");
		weekMap.put(WeekEnum2.THU, "四");
		weekMap.put(WeekEnum2.FRI, "五");
		weekMap.put(WeekEnum2.SAT, "六");
		weekMap.put(WeekEnum2.Sun, "日");
		for (Entry<WeekEnum2, String> entry : weekMap.entrySet()) {
			System.out.println(entry.getKey().getIndex() + "--" + entry.getKey().getDesc() + "--" + entry.getValue());

		}

		WeekEnum2 weekEnum2 = WeekEnum2.MON;
		int result = weekEnum2.compareTo(WeekEnum2.THU);
		System.out.println("比较结果:" + result);
		if (result > 0) {
			System.out.println("Mon在后面");

		} else if (result == 0) {
			System.out.println("Mon位置相同");

		} else {
			System.out.println("Mon在前面");
		}

	}

	private static void printSeason(SeaseonEnum seaseonEnum) {
		System.out.println(seaseonEnum);
		System.out.println(seaseonEnum.getSeasonName() + "++++" + seaseonEnum.getSeasonDesc());
	}

}
