import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a numeric value: ");
		String input1 = sc.nextLine();

		System.out.print("Enter a numeric value: ");
		String input2 = sc.nextLine();

		System.out.print("Choose an Operant: (+ - * /):");
		String input3 = sc.nextLine();
		try {
			double d1 = Double.parseDouble(input1);
			double d2 = Double.parseDouble(input2);

			switch (input3) {
			case "+":
				System.out.println(Add(d1, d2));
				break;
			case "-":
				System.out.println(Subtract(d1, d2));
				break;
			case "*":
				System.out.println(Multiply(d1, d2));
				break;
			case "/":
				System.out.println(Divide(d1, d2));
				break;
			default:
				System.out.println("You chose invalid operant!");
			}

		} catch (NumberFormatException e) {
			System.out.println("Invalid Number");
		}
	}

	static double Multiply(double d1, double d2) {
		double result = d1 * d2;
		return result;
	}

	static double Divide(double d1, double d2) {
		double result = d1 / d2;
		return result;
	}

	static double Add(double d1, double d2) {
		double result = d1 + d2;
		return result;
	}

	static double Subtract(double d1, double d2) {
		double result = d1 - d2;
		return result;
	}
}