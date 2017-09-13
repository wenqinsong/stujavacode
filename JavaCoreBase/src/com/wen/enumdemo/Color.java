package com.wen.enumdemo;

public enum Color implements Behaviour {
	RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLOW("黄色", 4);
	// 成员变量
	private String name;
	private int index;

	// 构造方法
	private Color(String name, int index) {
		this.name = name;
		this.index = index;
	}

	// 接口方法
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.name;
	}

	// 接口方法
	@Override
	public void print() {
		System.out.println(this.index + "：" + this.name);

	}

}
