package com.wen.enumdemo;

import lombok.Getter;

@Getter
public enum SeaseonEnum {
	//创建实例
	SPRING("春天","春风又绿江南岸"),SUMMER("夏天","映日荷花别样红"),AUTUMN("秋天","秋水共长天一色"),WINTER("冬天","窗含西岭千秋雪"),;
	
	//创建枚举
	private final String seasonName;//季节名称
	private final String seasonDesc;//季节描述
	
	//构造函数通常都是私有化
	private SeaseonEnum(String seasonName, String seasonDesc) {
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}
	
	//这是其他方法
	public void printSelf() {
		
		System.out.println(this.name()+"----"+this.ordinal()+"---"+this.getSeasonName()+"---"+this.getSeasonDesc());
		
	}

}
