package info.pablogiraldo.file;

import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Please enter a positive number:");
			while (!sc.hasNextInt()) {
				System.out.println("That's not a number!");
				sc.next(); // this is important!
			}
			number = sc.nextInt();
			sc.close();
		} while (number <= 0);

		System.out.println("Thank you! Got " + number);
	}
}