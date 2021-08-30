package org;

public class cars {

	private String name;
	private String price;
	private String topSpeed;
	public cars(String name, String price, String topSpeed) {
		super();
		this.name = name;
		this.price = price;
		this.topSpeed = topSpeed;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(String topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	

}
