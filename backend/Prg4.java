import java.util.Scanner;
public class Prg4{
	public static void main(String []ar)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num");
		int a = sc.nextInt();
		System.out.println("Enter 2nd num");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("Sum of "+a+" & "+b+" is "+sum);
	}
}