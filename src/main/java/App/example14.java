package App;

import java.util.Formatter;
import java.util.Scanner;

public class example14 {
    public static void main(String[] args){
        double amount, tax, rate, total;
        rate = 0.055;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the state? ");
        String state = input.nextLine();
        System.out.print("What is the order amount? ");
        amount = input.nextDouble();
        tax = amount * rate;
        total = amount + tax;
        Formatter fmt = new Formatter();
        Formatter TAX = new Formatter();
        Formatter ALL = new Formatter();
        fmt.format("%.2f", total);
        TAX.format("%.2f", tax);
        ALL.format("%.2f", amount);

        if(state.equals("WI"))
        {
            System.out.print("The subtotal is $"+amount+".\nThe tax is $"+TAX+".\nThe total is $"+fmt+".");
        }
        if(state != "WI")
        {
            System.out.print("The total is $"+ALL+".");
        }
    }
}
