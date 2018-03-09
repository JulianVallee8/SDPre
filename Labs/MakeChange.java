import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price, money;

		System.out.println("What is the price of your item? ");
		price = sc.nextDouble();

		System.out.println("How much would you like to use to pay for the item? ");
		money = sc.nextDouble();

		while (price > money) {
			System.out.println("Sorry, that wasn't enough to pay for the item.");
			System.out.println("Please provide sufficient amount for the item.");
			money = sc.nextDouble();
		}

		if (money == price) {
		System.out.println("Thank you for the exact change.\n Have a good day.");
		}

    else if(money > price) {
      double change = money - price;


      int finChange = (int)Math.round(change * 100);
      System.out.println("Here is your change in ");

      int twenties = finChange / 2000;
      finChange = finChange % 2000;
      System.out.println(twenties + " Twenties");
      int tens = finChange / 1000;
      finChange = finChange % 1000;
      System.out.println(tens + " Tens");
      int fives = finChange / 500;
      finChange = finChange % 500;
      System.out.println(fives + " Fives");
      int ones = finChange / 100;
      finChange = finChange % 100;
      System.out.println(ones + " Ones" );
      int quarter = finChange / 25;
      finChange = finChange % 25;
      System.out.println(quarter + " Quarters");
      int dime = finChange / 10;
      finChange = finChange % 10;
      System.out.println(dime + " Dimes");
      int nickel = finChange / 5;
      finChange = finChange % 5;
      System.out.println(nickel + " Nickels");
      int penny = finChange / 1;
      finChange = finChange % 1;
      System.out.println(penny + " Pennies");


    }






 }
}
