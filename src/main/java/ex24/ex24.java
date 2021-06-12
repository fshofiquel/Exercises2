/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class ex24
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        ex24 myEx24 = new ex24();
        String wordOne;
        String wordTwo;
        boolean tF;

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        wordOne = input.nextLine();


        System.out.print("Enter the second string: ");
        wordTwo = input.nextLine();

        tF = myEx24.isString(wordOne, wordTwo);

        if (tF)
            System.out.print("\"" + wordOne + "\"" + " and \"" + wordTwo + "\" are anagrams.");
        else
            System.out.print("\"" + wordOne + "\"" + " and \"" + wordTwo + "\" are not anagrams.");
    }

    public boolean isString(String wordOne, String wordTwo)
    {
        char[] stringOne = wordOne.toLowerCase().toCharArray();
        char[] stringTwo = wordTwo.toLowerCase().toCharArray();

        if (wordOne.length() != wordTwo.length())
        {
            return false;
        }

        else
        {
            Arrays.sort(stringOne);
            Arrays.sort(stringTwo);
            return Arrays.equals(stringOne, stringTwo);
        }
    }

}
