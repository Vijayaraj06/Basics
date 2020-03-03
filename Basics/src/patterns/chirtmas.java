package patterns;

public class chirtmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=1;k<=3;k++)
		{
			int n = 8;
			
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}}
		int l= 8,m=1;
		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print("     |  |");
			}
			System.out.println();
		}
	}


	}


