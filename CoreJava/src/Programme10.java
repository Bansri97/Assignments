
public class Programme10 {

	public static void main(String[] args) {
		int a,sum=0;
		for(int number=1;number<=100;number++)
		{
			a=0;
			for (int i=2;i<number/2;i++)
			{
				if(number%i==0)
				{
					a++;
					break;
				}
			}
			if(a==0&&number!=1)
			{
				sum=sum+number;
			}
		}
		System.out.println("the sum of primenumber is : "+sum);
	}
}
