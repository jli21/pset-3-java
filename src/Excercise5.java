import java.util.Scanner;

public class Excercise5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%-11s: ","Homework");
		double h1 = sc.nextInt();
		System.out.printf("%-11s: ", "Homework 2");
		double h2 = sc.nextInt();
		System.out.printf("%-11s: ", "Homework 3");
		double h3 = sc.nextInt();
		System.out.printf("%-11s: ", "Quiz 1");
		double q1 = sc.nextInt();
		System.out.printf("%-11s: ", "Quiz 2");
		double q2 = sc.nextInt();
		System.out.printf("%-11s: ", "Test 1");
		double t1 = sc.nextInt();
		
		double h = (h1+h2+h3)/3;
		double q = (q1+q2)/2;
		
		
		double grade = (h*.15+q*.35+t1*.5);
				
		System.out.printf("%n%.2f%%.", grade);
	}

}