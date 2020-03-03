package pack1;

public class FizzBuzz {
	void fizz() {
		int i = 50;
		for (i = 1; i <= 50; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizz buzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		FizzBuzz fb = new FizzBuzz();
		fb.fizz();
	}

}
