package pack1;

public class MyFirstJavaProgram {
	// This is a main class
	int add() {
		int a = 2, b = 3, c;
		c = a + b;
		System.out.println(c);
		return c;
	}

	int sub() {
		int a = 2, b = 3, c;
		c = a - b;
		System.out.println(c);
		return c;
	}

	// This is a main method
	public static void main(String[] args) {
		Basha b = new Basha();
		b.m();

		Jone a = new Jone();
		a.n();

		MyFirstJavaProgram obj = new MyFirstJavaProgram();
		obj.add();
		obj.sub();

		

	}

}

// This is a normal class 1
class Basha {
	void m() {
		System.out.println("Hi, Basha");
	}
}

// This is a normal class 2
class Jone {
	void n() {
		System.out.println("Hi, Jone");
	}
}
