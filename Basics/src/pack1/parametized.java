package pack1;

public class parametized {
	int add(){
		int a=2;
		int b=3;
		int c=a+b;
		System.out.println(c);
	return c;
	}
	int add1(int d,int e){
		int f=d+e;
		System.out.println(f);
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parametized obj=new parametized();
		// non parametized method
		// in below again again asking means given variable ans only coming
		obj.add();
		obj.add();
		/* parametized method
		 here you can give any value for need*/
		
		obj.add1(5,6);
		obj.add1(7, 8);
		obj.add1(10, 15);
		
	}

}
