import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("\n==================================");
			System.out.println("=       Ervin's Calculator       =");
			System.out.println("==================================");

			double a, b;
			System.out.println("\nEnter variable a:  ");
			a = input.nextDouble();
			System.out.println("\nEnter variable b:  ");
			b = input.nextDouble();

			CalculatorMethods digitron = new CalculatorMethods();
			System.out.println();
			System.out.println("Result of addition is : " + digitron.addition(a, b));
			System.out.println();
			System.out.println("Result of subtraction is : " + digitron.subtraction(a, b));
			System.out.println();
			System.out.println("Result of multiplication is : " + digitron.multiplication(a, b));
			System.out.println();
			System.out.println("Result of division is: " + digitron.division(a, b));
			System.out.println();
			System.out.println("Square root result is : " + digitron.sqrt(a));
			System.out.println();
			System.out.println("Result of square is : " + digitron.square(a));

		} catch (Exception e) {
			System.out.println("Please, enter correct variable type and try again.");
			main(args);
		}

		input.close();

	}

}
