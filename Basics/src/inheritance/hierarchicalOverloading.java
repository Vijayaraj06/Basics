package inheritance;

public class hierarchicalOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c=new C1();
		B1 b=new B1();
		c.add(1, 2);
		b.add(1, 2,3);
		c.add(1, 2,3,4);

	}

}
class A1{
int add(int a,int b)
{
	int c=a+b;
	System.out.println(c);
	return c;
}}
class B1 extends A1{
	int add(int a,int b,int c)
	{
		int d=a+b+c;
	System.out.println(d);
	return d;
	}
}
class C1 extends A1{
	int add(int a,int b,int c,int d)
	{
		int e=a+b+c+d;
	System.out.println(e);
	return e;
	}
}
