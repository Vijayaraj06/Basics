package patterns;

public class task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print(" ");
				if(i==j)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}
