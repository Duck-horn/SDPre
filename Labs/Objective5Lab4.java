import java.util.Scanner;

public class Objective5Lab4{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();

      if (userNum % 2 == 0) {
        System.out.println(userNum + " is even");
      }
      else {
        System.out.println(userNum + " is odd");
      }

    }

  }
