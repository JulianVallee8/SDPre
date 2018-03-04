import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;

      System.out.println("Please enter a number");
      num = sc.nextInt();

      if( num % 2 == 0){
        System.out.print("The number is even");
      }
      else{
        System.out.print("The number is odd");
      }

      sc.close();
    }
  }
