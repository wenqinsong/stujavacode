package com.jiekou2;

public class SaveDoor extends Door implements Lock,BellDoor {

	@Override
	public void lockup() {
		System.out.println("插进钥匙，左旋转，成功上锁");

	}

	@Override
	public void lockon() {
		System.out.println("插进钥匙，用旋转，锁已打开");

	}

	@Override
	public void photo() {
		System.out.println("照片以存储");
		
	}

}
