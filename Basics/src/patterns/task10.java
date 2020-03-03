package patterns;

public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int num = 1;
		int numm = 4;
		int m = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 && j >= 2) {
					System.out.print(j + " ");
				} else if (j == 1) {
					System.out.print(num + " ");
					num++;
				} else if (j == 5 && i != 1) {
					System.out.print(numm + " ");
					numm--;
				} else if (i == 5 && j != 1 && j != 5) {
					System.out.print(m + " ");
					m--;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
}
