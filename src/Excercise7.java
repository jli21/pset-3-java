import java.util.Scanner;
public class Excercise7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%-8s: ", "Salary");
		double salary = sc.nextDouble();
		System.out.printf("%-8s: ", "401(k)");
		double k401 = sc.nextDouble();
		System.out.printf("%-8s: ", "Federal");
		double federal = sc.nextDouble();
		System.out.printf("%-8s: ", "State");
		double state = sc.nextDouble();
		
		double pay = (salary * (1-k401/100) * (1-(state+federal)/100))/24;
		System.out.printf("%n$%,.2f.", pay);
		
		
	}
}
