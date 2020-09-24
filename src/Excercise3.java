import java.util.Scanner;

public class Excercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Height : ");
		double height = sc.nextDouble();
		System.out.print("Weight : ");
		double weight = sc.nextDouble();
		
		double area = (weight*height)*(645.16);
		System.out.printf("%n%,.2f square millimeters.", area);
	}
}
