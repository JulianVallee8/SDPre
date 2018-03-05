
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
		      while (change > 0) {
			       System.out.println("Here is your change in" );
			          if (change >= 20.00) {
				              System.out.println("Twenty Dollar Bills");
				              change -= 20.00;
			           }
			           else if (change >= 10.00) {
				               System.out.println("Ten Dollar Bills");
				               change -= 10.00;
			           }
			           else if (change >= 5.00) {
				               System.out.println("Five Dollar Bills");
				               change -= 5.00;
			           }
			           else if (change >= 1.00) {
				               System.out.println("One Dollar Bills");
				               change -= 1.00;
			           }
			           else if (change >= .25) {
				               System.out.println("Quarters");
				               change -= .25;
			           }
			           else if (change >= .10) {
				               System.out.println("Dimes");
				               change -= .10;
			           }
			           else if (change >= .05) {
				               System.out.println("Nickels");
				               change -= .05;
			           }
			           else if (change >= .01) {
				               System.out.println("Pennies");
				               change -= .01;
			           }
                }
              }
	}

}
