import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    Scanner keyboard = new Scanner(System.in);


    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old will you be this year?");
    age = keyboard.nextInt();
    currentYear = 2022;
    birthYear = currentYear - age;
    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
