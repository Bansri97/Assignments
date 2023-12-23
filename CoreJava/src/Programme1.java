import java.util.Scanner;

public class Programme1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A : ");
		a=sc.nextInt();
		System.out.println("Enter B : ");
		b=sc.nextInt();
		System.out.println("Enter C : ");
		c=sc.nextInt();
		
		if (a>=b && a>=c)
		{
			System.out.println("A is greatest Number");
		}
		else if (b>=a && b>=c)
		{
			System.out.println("B is greatest Number");
		}
		else
		{
			System.out.println("C is greatest Number");
		}
	}
}
