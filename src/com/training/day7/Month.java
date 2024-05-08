package com.training.day7;

public enum Month {
	
	JANUARY(31),FEBRUARY(28),MARCH(31),APRIL(30),MAY(31),JUNE(30),JULY(31),AUGUST(31),SEPTEMBER(30),OCTOBER(31),NOVEMBER(30),DECEMBER(31);
	
   int daysInAMonth;

public int getDaysInAMonth() {
	return daysInAMonth;
}

public void setDaysInAMonth(int daysInAMonth) {
	this.daysInAMonth = daysInAMonth;
}

private Month(int daysInAMonth) {
	this.daysInAMonth = daysInAMonth;
}
   
   

}
