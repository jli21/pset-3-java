import java.util.Scanner;

public class Excercise8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		
		System.out.printf("%-9s: ", "Students");
		int students = sc.nextInt();
		System.out.printf("%-9s: ", "Teachers");
		int teachers = sc.nextInt();
		System.out.printf("%-9s: ", "Capacity");
		int capacity = sc.nextInt();
		
		double total = students + teachers;
		double buses = (total + capacity - 1)/(capacity);
		double overflow = total % capacity;
				
		System.out.printf("%n%-20s: %d", "Buses required", (int)buses);
		System.out.printf("%n%-20s: %d", "Overflow passengers", (int)overflow);

	}
}