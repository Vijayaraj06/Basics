package patterns;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 3 || i == 1 || i == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		{
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		{
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		{
			System.out.println();
		}
		int x = 1;
		int y = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2; j++) {
				if (j == x || j == y) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			x++;
			y--;
			System.out.println();
		}
		{
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == 5 || j == 1 || i == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		{
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 5 || j == 1 || i == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
