package others;

import java.util.Scanner;

public class NumberOfDigitsAlternate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		num = (int) Math.log10(num) + 1;
		System.out.println("Number of digits: " + num);
		sc.close();

	}

}
/* Algorithm */
// See NumberOfDigitsAlternate.docx