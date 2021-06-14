/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex36;

import java.util.Scanner;

public class ex36
{
    public static void main(String[] args)
    {
        float test;
        ex36 myFuncs = new ex36();
        test = myFuncs.stdDev();
    }

    public float stdDev()
    {
        String input = "no";
        StringBuilder numInputed = new StringBuilder("Numbers: ");
        Scanner in = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int total = 0;
        int holder = 0;
        int counter = 1;
        int avg;
        System.out.print("Enter a number: ");
        input = in.next();
        numInputed.append(input).append(", ");
        min = Integer.parseInt(input);
        max = Integer.parseInt(input);

        while (!(input.equals("done")))
        {
            System.out.print("Enter a number: ");
            input = in.next();
            if (input.equals("done"))
                break;
            holder = Integer.parseInt(input);
            numInputed.append(input).append(", ");
            System.out.printf("holder=%d\n", holder);
            total += holder;
            if (holder > max)
                max = holder;
            if (holder < min)
                min = holder;
            counter++;
        }
        System.out.println(numInputed);
        avg = total / counter;
        System.out.printf("min%d, max%d numbers %d", min, max, total);

        return 0;
    }

}
