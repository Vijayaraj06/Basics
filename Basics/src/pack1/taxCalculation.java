package pack1;

public class taxCalculation {
	long tax(){
		long salary=900000;
		if(salary<=500000)
		{
			System.out.print(salary*0+" tax");
		}
		if(salary<=750000&&salary>=500000)
		{System.out.print(salary*5/100+" tax ");}
		if(salary>=750001&&salary<=1000000)
		{System.out.print(salary*10/100+" tax  ");}
		if(salary>=1000001)
		{System.out.print(salary*25/100+" tax  ");}
	    return salary;
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			taxCalculation obj=new taxCalculation();
			System.out.print(obj.tax());
	}

}
