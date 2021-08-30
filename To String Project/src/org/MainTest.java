package org;

public class MainTest {
	String stName;
	int IdNum;
	String depName;
	
	
	
	public MainTest(String stName, int idNum, String depName) {
		this.stName = stName;
		this.IdNum = idNum;
		this.depName = depName;
	}
	
	public String toString() {
		return stName+" "+IdNum+" "+depName ;
		
	}
	
	
	

}
