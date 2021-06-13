/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex28;

import java.util.Scanner;

public class ex28
{
    public static void main(String[] args)
    {
        ex28 myEx28 = new ex28();
        myEx28.loopyMath();
    }

    public void loopyMath()
    {
        int i;
        int number;
        int total = 0;
        Scanner input = new Scanner(System.in);

        for (i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            number = input.nextInt();
            total += number;
        }

        System.out.printf("The total is %d.", total);
    }

}
