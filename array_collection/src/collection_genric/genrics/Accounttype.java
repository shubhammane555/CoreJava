package com.genrics;

public interface Accounttype {
	<u extends Number> void deposite(u amount);
	<u extends Number> void withdraw(u amount);
	
void showbalence();

}
