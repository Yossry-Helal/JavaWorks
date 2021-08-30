package org;

public class Apparel implements Payment, PrintMessage {

	String name;
	double price;
	double discount;
	String tag;

	public Apparel(String name, double price, double discount, String tag) {
		super();
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.tag = tag;
	}

	@Override
	public double getPayTotal() {
		if (tag.equals("Outlet")) {
			return (price - (price * discount));

		} else {
			return price;
		}
	}

	@Override
	public String printIt() {
		// TODO Auto-generated method stub
		return "مرحبا بك في قسم الملابس";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "   : اسم المنتج " + name + "\n" + "الخصم : " + discount + name + "\n" + " السعر الاجمالي"
				+ getPayTotal() + "\n";

	}

	class Shirt {
		public void printTag() {
			System.out.println("مرحبا بك في الكلاس شيرت");
		}
	}

}
