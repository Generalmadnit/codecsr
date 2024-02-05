import java.util.Scanner;
public class Prg6{
	public static void main(String []ar){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		System.out.println("Result of num1 > num2 "+(a>b));
	}
}