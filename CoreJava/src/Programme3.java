import java.util.Scanner;

public class Programme3 {

	public static void main(String[] args) {
		int a,b,factorial;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		a=sc.nextInt();
		factorial=1;
		b=1;
		
		while(b<=a)
		{
			factorial=factorial*b;
			b++;
		}
		System.out.println(factorial);
	}
}
