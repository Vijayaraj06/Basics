package patterns;

public class v {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int x = 1;
		int y = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2; j++) {
				if (j == x ) {
					System.out.print(y);
				}
				if(i==x){System.out.println(x);}
					
					else {
				}
					System.out.print(" ");
				}
			
			x++;
			y--;
			System.out.println();
}}}
