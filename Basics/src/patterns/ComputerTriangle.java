package patterns;

public class ComputerTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c="COMPUTER";
		char a[]=c.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println(" ");
		}
	}

}
