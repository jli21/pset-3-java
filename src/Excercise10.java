import java.util.Scanner;
public class Excercise10 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Fahrenheit : ");
	        double fahrenheit = sc.nextDouble();

	        double celsius =  5/9 * (fahrenheit - 32);
	        double kelvin = 273.15 + celsius;

	        System.out.printf("\nCelsius    : %,.2f", celsius);
	        System.out.printf("\nKelvin     : %,.2f", kelvin);
	}
}
