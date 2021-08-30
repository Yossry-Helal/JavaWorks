package org;

public class Mission {

	public static void main(String[] args) {
		Developer d1 = new Developer();
		d1.setAge(2);
		d1.setFavorite("Android Track");
		d1.setName("Candroid");

		System.out.print("Your name is " + d1.getName()+"\n\t" + "-and your age is " + d1.getAge() +"\n\t"+  "-and your favroite is "
				+ d1.getFavorite());
	}

}
