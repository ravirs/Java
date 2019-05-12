import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann1 = new Scanner(System.in);
		System.out.println("Eneter the number to find the square root of a a number");
		double square = scann1.nextDouble();
		double squareroot = Math.sqrt(square);
		System.out.printf("Square Root of number", square, squareroot);

}
}