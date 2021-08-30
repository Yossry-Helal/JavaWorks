package org;

public class Electronics implements Payment, PrintMessage {

	int count;
	String name;
	double price;
	boolean delivery;

	public Electronics(int count, String name, double price, boolean delivery) {
		this.count = count;
		this.name = name;
		this.price = price;
		this.delivery = delivery;
	}

	@Override
	public double getPayTotal() {
		if (delivery) {
			return (count * price) + 2.0;

		} else {
			return count * price;
		}
	}

	@Override
	public String printIt() {
		// TODO Auto-generated method stub
		return "مرحبا بك في قسم الاليكتونيات";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "   : اسم المنتج " + name + "\n" 
				+ "العدد : " + name + "\n" + " السعر الاجمالي"
				+ getPayTotal() + "\n";
	}

}
