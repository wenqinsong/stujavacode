package com.wed.collection;



import java.util.ArrayList;
import java.util.List;



public class ArrayListDemo {
@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Dog ououDog =new Dog("欧欧");
		List dogs =new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(new Dog("yaya"));
		dogs.add(new Dog("meimei"));
		dogs.add(0,new Dog("awang"));
		
		System.out.println("共有"+dogs.size()+"条狗");
		printList(dogs);
		
		Dog yayaDog =new Dog("yaya");
		if (dogs.contains(yayaDog)) {
			
			System.out.println("包含");
		} else {
			
			System.out.println("不包含");

		}
		System.out.println("删除容器中的第二个元素");
		dogs.remove(1);
		printList(dogs);
		
		System.out.println("删除指定ouou狗狗");
		dogs.remove(ououDog);
		printList(dogs);

	}
@SuppressWarnings("all")
public static void printList(List dogs) {
	for(int i =0;i < dogs.size();i++) {
		
		Dog dog =(Dog) dogs.get(i);
		System.out.println(dog);
		
	}
}

}
