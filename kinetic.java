
import java.util.Scanner;

public class Kinetic {
	public static void main(String[] args) {
		double m, v, k
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the mass: ");
		m = scan.nextDouble();
		System.out.print("Enter the velocity: ");
		v = scan.nextDouble();

		k = kinetic(m,v);

		System.out.printf("The ke is: %.2f\n")

	}

	public static double kinetic(double mass, double vel) {
		double ke = 1.0/2 * mass * vel * vel
		return ke;
	}