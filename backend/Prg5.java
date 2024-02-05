import java.util.Scanner;
public class Prg5{
	public static void main(String []arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of rectangle");
		double base = sc.nextDouble();
		System.out.println("Enter the height of rectangle");
		double height = sc.nextDouble();
		double area = 0.5*base*height;
		System.out.println("Area calculated is "+area);
	}
}