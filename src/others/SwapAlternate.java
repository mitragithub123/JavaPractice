package others;

import java.util.Scanner;

public class SwapAlternate {
	public void swap(int a, int b) {
		a = a + b - (b = a);
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
// Assignment in Java is right-associative, meaning assignments inside parentheses () happen first.
// Before Swapping: a = 5, b = 10
// Evaluate b = a
//(b = a) assigns b = 5, so now:
// b = 5, a = 5
// Compute a = a + b - (b = a);
// a = 5 + 10 - 5 = 10
// and b=5 already
// No extra variable needed (saves memory).
// Faster than using XOR swap (since XOR requires three operations).
// Works for both positive and negative numbers.