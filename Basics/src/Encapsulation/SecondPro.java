package Encapsulation;

public class SecondPro {

	public static void main(String[] args) {

		// one object creation
		FirstPro obj = new FirstPro(); // obj is an object of FirstPro
		System.out.println(obj.getA()); // Initial value of a is 1 --> obj
		obj.setA(11); // re assign the value of a to 11 --> obj
		System.out.println(obj.getA()); // latest value of a is 11 --> obj

		// another object creation
		FirstPro obj1 = new FirstPro(); // obj1 is an object of FirstPro
		System.out.println(obj1.getA());// Initial value of a is 1 --> obj1
		obj1.setA(156);// re assign the value of a to 156 --> obj1
		System.out.println(obj1.getA()); // latest value of a is 156 --> obj1

	}
}
