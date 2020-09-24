import java.util.Scanner;

public class Excercise9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%-9s:", "Amount");
		double amountC = sc.nextDouble();
		
		int amount = (int)(100 * amountC);
		int quarters = amount/25;
		int dimes = (amount-quarters*25)/10;
		int nickles = (amount-quarters*25-dimes*10)/5;
		int pennies = (amount-quarters*25-dimes*10-nickles*5);
		
		System.out.printf("%n%-9s: %d", "Quarters", quarters);
		System.out.printf("%n%-9s: %d", "Dimes", dimes);
		System.out.printf("%n%-9s: %d", "Nickels", nickles);
		System.out.printf("%n%-9s: %d", "Pennies", pennies);
	}
}
