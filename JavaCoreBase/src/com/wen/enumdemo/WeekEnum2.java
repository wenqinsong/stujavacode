package com.wen.enumdemo;



import lombok.Getter;
import sun.security.provider.Sun;

@Getter
public enum WeekEnum2 {
	
	MON(1,"星期一"),TUE(2,"星期二"),WED(3,"星期三"),THU(4,"星期四"),FRI(5,"星期五"),SAT(6,"星期六"){
		
		public boolean isRest() {
			return true;
		}
	},
		Sun(7,"星期日"){
		public boolean isRest() {
			return true;
		}
	};
	
	private int index;
	private String desc;
	
	private WeekEnum2(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}
	
	public boolean isRest() {
		return false;
	}
	

}
