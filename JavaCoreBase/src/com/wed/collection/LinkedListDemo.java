package com.wed.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
@SuppressWarnings("all")
	public static void main(String[] args) {
		
		LinkedList dogs = new LinkedList();
		Dog ououDog =new Dog("欧欧");
		Dog yayaDog =new Dog("丫丫");
		Dog meimeiDog =new Dog("美美");
		Dog feifeiDog =new Dog("肥肥");
		System.out.println("dogs：");
		dogs.add(ououDog);
		dogs.add(yayaDog);
		ArrayListDemo.printList(dogs);
		System.out.println("在头部和尾部添加对象：");
		dogs.addFirst(feifeiDog);
		dogs.addLast(meimeiDog);
		ArrayListDemo.printList(dogs);
		
		Dog dogFirst =(Dog) dogs.getFirst();
		System.out.println("第一条狗狗的昵称是"+dogs.getFirst());
		
		Dog dogLast =(Dog) dogs.getLast();
		System.out.println("最后一条狗狗的昵称是"+dogs.getLast());
		
		System.out.println("删除第一个元素");
		dogs.removeFirst();
		ArrayListDemo.printList(dogs);
		
		System.out.println("删除最后一个元素");
		dogs.removeLast();
		ArrayListDemo.printList(dogs);
	}

}
