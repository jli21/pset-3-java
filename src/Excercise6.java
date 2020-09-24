import java.util.Scanner;

public class Excercise6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%-10s: ", "Wage");
		double wage = sc.nextDouble();
		System.out.printf("%-10s: ", "Monday");
		double Mon = sc.nextInt();
		System.out.printf("%-10s: ", "Tuesday");
		double Tues = sc.nextInt();
		System.out.printf("%-10s: ", "Wednesday");
		double Wed = sc.nextInt();
		System.out.printf("%-10s: ", "Thursday");
		double Th = sc.nextInt();
		System.out.printf("%-10s: ", "Friday");
		double Fri = sc.nextInt();
		System.out.printf("%-10s: ", "Saturday");
		double Sat = sc.nextInt();
		System.out.printf("%-10s: ", "Sunday");
		double Sun = sc.nextInt();
		
		double total = wage * (Mon + Tues + Wed + Th + Fri + Sat + Sun);
		
		System.out.printf("%n$%,.2f.", total);
	}
}
