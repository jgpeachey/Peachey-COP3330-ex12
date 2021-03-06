/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Base;

/*
Create a program that computes simple interest. Prompt for the principal
amount, the rate as a percentage, and the time, and display the amount
accrued (principal + interest).

The formula for simple interest is A = P(1 + rt), where P is the principal
amount, r is the annual rate of interest, t is the number of years the
amount is invested, and A is the amount at the end of the investment.

Example Output:
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.

Constraints:
*Prompt for the rate as a percentage (like 15, not .15). Divide the input
by 100 in your program.
*Ensure that fractions of a cent are rounded up to the next penny.
*Ensure that the output is formatted as money.

Challenges:
*Ensure that the values entered for principal, rate, and number of years are
numeric and that the program will not let the user proceed without valid inputs.
*Alter the program to use a function called calculateSimpleInterest that takes
in the rate, principal, and number of years and returns the amount at the end
of the investment.
*In addition to printing out the final amount, print out the amount at the
end of each year.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the principal: ");
        double principle = in.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = in.nextDouble();
        System.out.println("Enter the number of years: ");
        double years = in.nextDouble();

        double total = Math.round(principle*(1+((rate/100)*years))*100.0)/100.0;

        System.out.println("After "+years+" years at "+rate+"%, the investment will be worth $"+total+".");
    }
}
