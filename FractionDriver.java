/*
 * Author: Suki Sahota
 * Description: Fraction OOP Practice Driver
 */
import java.util.*;
public class FractionDriver {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("\nWe will construct a fraction from two integers of your choosing. Please select an integer to use as the numerator: ");
        int num = kb.nextInt();
        System.out.println("Thank you. Now may you please enter an integer to use as the denominator: ");
        int denom = kb.nextInt();
        Fraction f1 = new Fraction(num, denom);
        System.out.println();
        System.out.println("Your fraction is " + f1);
        System.out.println("The greatest common denominator of your fraction is " + f1.gcd());
        if (f1.gcd() > 1) {
            System.out.println("Your fraction reduces to " + f1.reduceFraction());
        } else {
            System.out.println("Sorry, your fraction is already in smallest terms.");
        }

        System.out.println();
        System.out.println("\nLet's create a new fraction for you.");
        Fraction f2 = new Fraction();
        System.out.println("Oops! We didn't put any values in for your new fraction. That's ok! We can set the values manually by using our setter method.");
        System.out.println("What would you like to set the numerator of your new fraction? ");
        int num2 = kb.nextInt();
        f2.setNumerator(num2);
        System.out.println("Perfect. Now let's set the denominator of your new fraction: ");
        int denom2 = kb.nextInt();
        while (!f2.setDenominator(denom2)) {
            System.out.println("I'm sorry, but zero is not an acceptable denominator to use in fractions. Please select another value: ");
            denom2 = kb.nextInt();
        }
        System.out.println("Good, now we have your new fraction ready to go. Let's check if it the same as your previous fraction.");
        System.out.println();
        if (f1.equals(f2)) {
            System.out.println("Your fractions are the same.");
        } else if (f1.reduceFraction().equals(f2.reduceFraction())) {
            System.out.println("Your fractions reduce to equivalent values!");
        } else {
            System.out.println("Looks like you have two unique fractions! See you next time.");
        }
    }
}