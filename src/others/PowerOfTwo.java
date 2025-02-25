package others;

import java.util.Scanner;

/**
 * @author mitrabhanu
 * @created 25-Feb-2025
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		if ((num & (num - 1)) == 0) {
			System.out.println("Power of 2");
		} else {
			System.out.println("Not a power of 2");
		}
		sc.close();
	}

}
