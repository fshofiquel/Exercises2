/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex29;

import java.util.Scanner;

public class ex29
{
    public static void main(String[] args)
    {
        ex29 myEx29 = new ex29();
        double numOfYears;
        int roundedYears;
        numOfYears = myEx29.numOfYears();
        roundedYears = (int) Math.ceil(numOfYears);

        System.out.printf("It will take %d years to double your inital investment.", roundedYears);
    }

    public double numOfYears()
    {
        String rate = "placeholder";
        double properRate;
        Scanner input = new Scanner(System.in);

        while (!(rate.matches("[1-9]+")))
        {
            System.out.print("What is the rate of return? ");
            rate = input.next();
            if (!(rate.matches("[1-9]+")))
                System.out.print("Sorry. That's not a valid input.\n");
        }

        properRate = Integer.parseInt(rate);
        return 72 / properRate;
    }
}
