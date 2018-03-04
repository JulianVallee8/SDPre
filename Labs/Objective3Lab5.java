import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    double num1, num2, sum;

    Scanner input = new Scanner(System.in);

    System.out.println("Lets get the sum of two numbers.");
    System.out.println("Provide your first number: ");
    num1 = input.nextDouble();

    System.out.println("Provide your second number: ");
    num2 = input.nextDouble();

    sum = num1 + num2;
    System.out.print("The sum of your two numbers is: " + sum);

    input.close(); 
  }
}
