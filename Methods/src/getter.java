class Person {

	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name);
	}

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;

	}
}

public class getter {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Yossry";
		person1.age=30;
		
		
		int years=person1.calculateYearsToRetirement();
		System.out.println("Years till retirement "+ years);
		
		
		int age=person1.getAge();
		String name=person1.getName();
		
		//System.out.println("Name is "+ name);
		person1.speak();
		System.out.println("Age is "+ age);
		

	}

}