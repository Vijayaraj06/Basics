package TestForAndLoop;

public class While {

	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		int i=1;
		while(i<=10000000)
		{
			System.out.println(i);
			i++;
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-starttime+"ms");
	}

}
