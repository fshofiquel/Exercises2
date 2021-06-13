/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex26;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ex26
{
    public static void main(String[] args)
    {
        ex26 myEx26 = new ex26();
        double n;  // num of months
        double APR;
        float b;  // balance
        float p;  // monthly payment
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        b = input.nextFloat();
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = input.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        p = input.nextFloat();

        n = myEx26.calculateMonthsUntilPaidOff(b, APR, p);

        System.out.printf("It will take you %.0f months to pay off this card.", n);
    }

    public double calculateMonthsUntilPaidOff(float b, double APR, float p)
    {
        double n;
        double i;
        double aprInPer;
        b = (float) Math.ceil(b);
        p = (float) Math.ceil(p);


        aprInPer = APR / 100;
        i = aprInPer / 365;

        n = -(1.0 / 30) * (Math.log(1 + b / p * (1 - Math.pow((1 + i), 30))) / Math.log(1 + i));
        n = Math.ceil(n);

        return n;
    }


}
