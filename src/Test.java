/* Programming Fundamentals 
 * Antonio Brown 
 * Programming Assignment 4 - Set ADT
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Print out program header
		System.out.println("Programming Fundamentals");
		System.out.println("Antonio Brown");
		System.out.println("PROGRAMMING ASSIGNMENT 4-Set AD\n");

		// Initialize new scanner
		Scanner testScan = new Scanner(System.in);

		// Reference method Set
		Set testSet = new Set();

		// Sets a value condition of true
		boolean testAns = true;

		// While the condition is true the user input is read
		while (testAns) {
			System.out.print("Enter command: ");

			String[] array = testScan.nextLine().split(" ");

			// switch statement assigns entered value to proper command as long as a valid
			// one
			// has been entered
			try {
				switch (array[0]) {
				case "add":
					testSet.add(Integer.valueOf(array[1]));
					System.out.println(testSet);
					break;

				case "del":
					testSet.delete(Integer.valueOf(array[1]));
					System.out.println(testSet);
					break;

				case "exists":
					System.out.println(testSet.exists(Integer.valueOf(array[1])));
					break;

				default:
					System.out.println("Please enter a valid command... ");

				}

				// the catch statement allows user to re-enter proper statement
			} catch (NumberFormatException e) {
				System.out.println("Please enter a valid number... ");

			}

		}
		testScan.close();
	}

}