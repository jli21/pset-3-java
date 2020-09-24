import java.util.Scanner;

public class Excercise4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Height : ");
		double height = sc.nextDouble();
		System.out.print("Weight : ");
		double weight = sc.nextDouble();
		
		double perimeter = 2*(weight+height) * 2.54;
		System.out.printf("%n%,.2f square millimeters.", perimeter);
	}
}

