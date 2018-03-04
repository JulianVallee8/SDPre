public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1 = 5.0, side2 = 8.0, num, hypotenuse;

    num = (side1*side1) + (side2*side2);
    hypotenuse = Math.sqrt(num);
    System.out.println("The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);


  }
}
