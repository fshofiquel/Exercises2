/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex30;

public class ex30
{
    public static void main(String[] args)
    {
        ex30 myEx30 = new ex30();
        myEx30.multTable();
    }

    public void multTable()
    {
        int outLoop;
        int innerLoop;

        for (outLoop = 1; outLoop <= 12; outLoop++)
        {
            for (innerLoop = 1; innerLoop <= 12; innerLoop++)
            {
                System.out.printf("%4d", outLoop*innerLoop);
            }
            System.out.println();
        }
    }

}
