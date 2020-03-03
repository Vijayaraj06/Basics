package TestForAndLoop;




public class For {

	public static void main(String[] args) {

long starttime=System.currentTimeMillis();
		for (int i = 1; i <= 10000000; i++) {
			System.out.println(i);
		}
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-starttime+"ms");
	}

}