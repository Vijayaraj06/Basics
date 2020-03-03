package pack1;

public class flagLogic {
	long prime() {
		int num = 16;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}
		if (flag) {
			System.out.print("not a prime number  ");
		} else {
			System.out.print("prime number  ");
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		flagLogic obj = new flagLogic();
	   System.out.print(obj.prime());
	}

}
