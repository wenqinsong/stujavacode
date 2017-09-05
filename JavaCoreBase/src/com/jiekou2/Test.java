package com.jiekou2;

public class Test {

	public static void main(String[] args) {
		
		SaveDoor save  = new SaveDoor();
		Door door = save;
		Lock lock = save;
		BellDoor bDoor = save;
		door.openDoor();
		lock.lockon();
		lock.lockup();
		bDoor.photo();
		
	}

}
