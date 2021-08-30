package org;

public class ClothingItem {
	public String type;  // <- Instance variable of the class

	public static void main(String[] args) {
		ClothingItem item = new ClothingItem();
		item.type = "Hat";
		item.displayItem();

	}
    // Instance method
	private void displayItem() {
		System.out.println("This is a " + this.type);
	}

}
