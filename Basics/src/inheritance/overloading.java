package inheritance;

public class overloading {
	int add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		return c;
	}
	int add(int a,int b,int c)
	{
		int d=a+b+c;
	System.out.println(d);
	return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading over=new overloading();
		over.add(7,3);
		over.add(7,4,3);
		

	}

}
