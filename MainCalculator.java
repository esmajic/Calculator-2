import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		try {
			System.out.println("\n==================================");
			System.out.println("=       Ervin's Calculator       =");
			System.out.println("==================================");

			double a, b;

			System.out.println("\nSelect desired operation:  ");
			System.out.println("\n============================");
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			System.out.println("5 for square root");
			System.out.println("6 for power calculation");
			System.out.println("0 for Exit");
			System.out.println("============================");

			int selection = input.nextInt();
			CalculatorMethods digitron = new CalculatorMethods();

			switch (selection) {
			case 1:
				System.out.println("\nEnter variable a:  ");
				a = input.nextDouble();
				System.out.println("Enter variable b:  ");
				b = input.nextDouble();
				System.out.println("\nResult of addition is : " + digitron.addition(a, b));
				break;
			case 2:
				System.out.println("\nEnter variable a:  ");
				a = input.nextDouble();
				System.out.println("Enter variable b:  ");
				b = input.nextDouble();
				System.out.println("\nResult of asubtraction is : " + digitron.subtraction(a, b));
				break;
			case 3:
				System.out.println("\nEnter variable a:  ");
				a = input.nextDouble();
				System.out.println("Enter variable b:  ");
				b = input.nextDouble();
				System.out.println("\nResult of multiplication is : " + digitron.multiplication(a, b));
				break;
			case 4:
				System.out.println("\nEnter variable a:  ");
				a = input.nextDouble();
				System.out.println("Enter variable b:  ");
				b = input.nextDouble();
				System.out.println("\nResult of division is: " + digitron.division(a, b));
				break;
			case 5:
				System.out.println("\nEnter variable a:  ");
				a = input.nextDouble();
				System.out.println("\nResult of square root is: " + digitron.sqrt(a));
				break;
			case 6:
				System.out.println("\nEnter variable a:  ");
				a = input.nextDouble();
				System.out.println("\nResult of power calculation is: " + digitron.square(a));
				break;
			case 0:
				System.out.println("\nThank you for using Ervin's calculator. Bye-bye.");
			default:
				System.out.println("\nError. Your selection entry was incorrect. Try again.");
				break;
			}

		} catch (Exception e) {
			System.out.println("Please, enter correct variable type and try again.");
			main(args);
		}

		input.close();

	}

}
