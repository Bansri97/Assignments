import java.util.Scanner;

public class Programme28 {

	public static void Grades(int marks) {
		if (marks >= 91 && marks <= 100) {
            System.out.println("Grade: AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade: AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade: BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade: BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade: CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade: DD");
        } else if (marks <= 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
    
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks: ");
        int usermarks=sc.nextInt();
        
        Grades(usermarks);
       
	}
}
