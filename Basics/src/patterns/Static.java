package patterns;

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.m();
	}

}
class A
{
	int a=10;
	static void m()
	{
		A obj=new A();
		System.out.println(obj.a);
	}
}