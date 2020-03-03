package whileImportantProgram;

public class numberPolidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 16464644;
		int numbers = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (numbers == rev) {
			System.out.println("polindrime");
		} else {
			System.out.println("np");
		}

	}

}
