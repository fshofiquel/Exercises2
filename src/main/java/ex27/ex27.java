/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex27;

import java.util.Scanner;

public class ex27
{
    public static String firstName;
    public static String lastName;
    public static String zipCode;
    public static String empID;

    public static void main(String[] args)
    {
        ex27 myEx27 = new ex27();
        boolean flag1, flag2, flag3, flag4;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        firstName = input.next();
        flag1 = myEx27.firstChecker();

        System.out.print("Enter the last name: ");
        lastName = input.next();
        flag2 = myEx27.lastChecker();

        System.out.print("Enter the ZIP code: ");
        zipCode = input.next();
        flag3 = myEx27.zipChecker();

        System.out.print("Enter an employee ID: ");
        empID = input.next();
        flag4 = myEx27.IDchecker();

        myEx27.validateInput(flag1, flag2, flag3, flag4);
    }

    public boolean firstChecker()
    {
        int length;
        length = firstName.length();
        return length >= 2;
    }

    public boolean lastChecker()
    {
        int length;
        length = lastName.length();
        return length >= 2;
    }

    public boolean zipChecker()
    {
        return zipCode.matches("[0-9]+$");
    }

    public boolean IDchecker()
    {
        return empID.matches("^[-\\w{2}\\d{4}]+$");
    }


    public void validateInput(boolean flag1, boolean flag2, boolean flag3, boolean flag4)
    {
        if (flag1 && flag2 && flag3 && flag4)
        {
            System.out.print("There were no errors found.");
        }
        else
        {
            System.out.println("Errors found in: ");
            System.out.println(flag1);
            System.out.println(flag2);
            System.out.println(flag3);
            System.out.println(flag4);
        }

    }


}
