package pack1;

public class HomeWorkProgramme {
	void prime() {
		int num = 5;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
			}

		}
		if (count == 2) {
			System.out.println(num + " prime numer");
		} else {
			System.out.println(num + " not a prime number");
		}
	}

	void perfect() {

		int num = 28;
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}

		}
		if (sum == num) {
			System.out.println(num + " perfect numer");
		} else {
			System.out.println(num + " not a perfect number");
		}
	}

	void factors_of_number() {
		int num = 48;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	void factoriel()
	{
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	void natural_num()
	{
		int n=5;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	void swap()
	{
		int a=2;
		int b=3;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
	void swap1()
	{
		int a=2;
		int b=3;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	void greatest()
	{
		int a=3;
		int b=2;
		int c=4;
		int x=(a>b?a:b);
		int y=(b>c?b:c);
		int z=(x>y?x:y);
		System.out.println(z);
	}
	void count_the_factors_of_48()
	{
		int num=48;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count=count+i;
			}
		}
		System.out.println(count);
	}
	void oddorevent()
	{
		int n=5;
		if(n%2==0)
		{
			System.out.println(n+" is a Even number");
		}
		else
		{
			System.out.println(n+" is a Odd number");
		}
	}
	void clock()
	{
		double h=2.30;
		double m=45.00;
		double teta=(30*h)-(5.5*m);
		if(teta<0)
		{
			teta=teta*-1;
		}
		if(teta>180)
		{
			teta=360-teta;
		}
		System.out.println(teta);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeWorkProgramme obj = new HomeWorkProgramme();
		obj.prime();
		obj.perfect();
		obj.factors_of_number();
		obj.factoriel();
		obj.natural_num();
		obj.swap();
		obj.swap1();
		obj.greatest();
		obj.count_the_factors_of_48();
		obj.oddorevent();
		obj.clock();

	}

}
