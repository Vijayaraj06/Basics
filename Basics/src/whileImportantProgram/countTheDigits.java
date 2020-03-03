package whileImportantProgram;

public class countTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 228735;
		int count = 0;
		while (num != 0) 
		{
			num = num / 10;
			count=count+1;
		}
		System.out.println(count);
		for(int i=1;i<=num;i++)
		{
			if(num != 0)
			{
				num = num / 10;
				count++;
			}
		}
		System.out.println(count);

		
	}

	}


