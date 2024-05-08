package com.training.day7;

public enum Day {
	MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5);

    int val;
	
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	
	Day(int val) {
		this.val=val;
	}
	
}
