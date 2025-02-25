package others;

import java.util.Scanner;

public class EvenorOddAlternate {
	public void checkEvenOrOdd(int no) {
		if ((no & 1) == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		EvenorOddAlternate ob = new EvenorOddAlternate();
		ob.checkEvenOrOdd(number);
		sc.close();
	}

}
/* Algorithm */
// The bitwise AND (&) operator compares each bit of two numbers.
//When checking even or odd, we use num & 1 because:
//Even numbers always have 0 as the least significant bit (LSB) in binary.
//Odd numbers always have 1 as the least significant bit (LSB) in binary.
//4 (Even)-->	100 & 1-->	100 & 001 = 000	-->Even
//7 (Odd)-->	111 & 1-->	111 & 001 = 001	-->Odd
//Faster than division (% 2):
//num % 2 == 0 also works but involves division, which is slower than bitwise operations.
//num & 1 is a single bitwise operation (O(1) complexity).