package com.oop;


public class TestScore {
	public double calAvg(int[] score) {
		int sum =0;
		double avg =0.0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
			avg=(double)sum/score.length;
			
		}
		return avg;
	
	}
	public void name() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
