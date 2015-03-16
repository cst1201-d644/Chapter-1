package lab1;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This program calculates the total price which includes sales tax.
 *
 * @JianLang Lin <a href="mailto:jllin1125@yahoo.com">JianLang Lin</a>
 */
public class SalesTax {

    public static void main(String[] args) {
        //identifier declarations
        final double TAX_RATE = 0.055;
        double price;
        double tax;
	double total;
        String item;

        //create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.00");

        //display prompts and get input
        System.out.print("Item description:  ");
        item = keyboard.nextLine();
        System.out.print("Item price:  $");
        price = keyboard.nextDouble();

        //calculations
        tax = price * TAX_RATE;
        total = price + tax;

        //display results
        System.out.print(item + "        $");
        System.out.println(formatter.format(price));
        System.out.print("Tax          $");
        System.out.println(formatter.format(tax));
        System.out.print("Total        $");
        System.out.println(formatter.format(total));
    }
}
