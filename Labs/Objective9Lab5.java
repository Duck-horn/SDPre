import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner (System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    // Part 1:
    // prompt the user to provide one number and store their input in num1
    System.out.print("Please give me a number: ");
    num1 = kb.nextDouble();

    // Part 2:
    // Prompt the user for another number and store their input in num2
    System.out.print("Please give me another number: ");
    num2 = kb.nextDouble();

		while (keepGoing) {
			printMenu();
			System.out.print("Which would you like to do? ");
			choice = kb.nextInt();

      // Part 3:
      // Complete this switch, with each case calling one of the methods below,
      // then printing out the result (refer to "Expected Output" below)
			switch (choice) {

           case 1:
           double out1 = findSum (num1, num2);
           System.out.println(num1 + " and " + num2 + " is: " + out1);
           break;

           case 2:
           double out2 = findAverage (num1, num2);
           System.out.println("the average of " + num1 + " and " + num2 + " is: " + out2);
           break;

           case 3:
           double out3 = calcTax (num1, num2);
           System.out.println("the amount in tax to be collected from a purchase of " + num1 + " and " + num2 + " is: " + out3);
           break;

           case 4:
           System.out.println("You've chosen to quit");
           keepGoing = false;
           break;

          default:
            System.out.println("That is not a valid choice");
          break;
		}


	}
	kb.close();

}
	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
	}

	public static double findSum (double x, double y) {
		double calc = x + y;
		return calc;
	}

  // Part 4:
  // Write a method named "findAverage" that takes two doubles as parameters,

  public static double findAverage (double a, double b) {
       double calc = (a + b) / 2;
       return calc;
  }

  // Part 5:
  // Write a method named "calcTax" that also takes two doubles as parameters,

  public static double calcTax (double x, double y) {
       double calc = (x * y * .0831);
       return calc;
  }
 }
