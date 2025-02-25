package others;

import java.util.Scanner;

public class SwapTwoVariableUsingXOR {
	public void swap(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter number2: ");
		int num2 = sc.nextInt();

		System.out.println("Result after swapping....");

		SwapUsingTemp var = new SwapUsingTemp();
		var.swap(num1, num2);
		sc.close();
	}

}
/* Algorithm */
// Step 1: a = a ^ b → 5 ^ 10 → Binary: 0101 ^ 1010 = 1111 (15), now a = 15, b = 10.
// Step 2: b = a ^ b → 15 ^ 10 → Binary: 1111 ^ 1010 = 0101 (5), now a = 15, b = 5.
// Step 3: a = a ^ b → 15 ^ 5 → Binary: 1111 ^ 0101 = 1010 (10), now a = 10, b = 5.