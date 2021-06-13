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
    public static String output1, output2, output3, output4, outFinal;

    public static void main(String[] args)
    {
        ex27 myEx27 = new ex27();
        int flag1 = 0, flag2 = 0, flag3 = 0, flag4 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        firstName = input.nextLine();
        flag1 = myEx27.firstChecker();

        System.out.print("Enter the last name: ");
        lastName = input.nextLine();
        flag2 = myEx27.lastChecker();

        System.out.print("Enter the ZIP code: ");
        zipCode = input.nextLine();
        flag3 = myEx27.zipChecker();

        System.out.print("Enter an employee ID: ");
        empID = input.nextLine();
        flag4 = myEx27.IDchecker();

        myEx27.validateInput(flag1, flag2, flag3, flag4);
        System.out.print(outFinal);
    }

    public int firstChecker()
    {
        if (firstName.isBlank())
            return -1;
        int length;
        length = firstName.length();
        return length >= 2 ? 1 : 0;
    }

    public int lastChecker()
    {
        if (lastName.isBlank())
            return -1;
        int length;
        length = lastName.length();
        return length >= 2 ? 1 : 0;
    }

    public int zipChecker()
    {
        if (zipCode.isBlank())
            return -1;
        return zipCode.matches("[0-9]+$") ? 1 : 0;
    }

    public int IDchecker()
    {
        if (empID.isBlank())
            return -1;
        return empID.matches("[\\w{2}]+[\\-]+[\\d{4}]") ? 1 : 0;
    }

    public void parseFlags(int flag1, int flag2, int flag3, int flag4)
    {
        if (flag1 != 1)
        {
            if (flag1 == 0)
                output1 = "\"" + firstName + "\" is not a valid first name. It is too short.\n";
            else
                output1 = "The first name must be filled in.\n";
        }

        if (flag2 != 1)
        {
            if (flag1 == 0)
                output2 = "\"" + lastName + "\" is not a valid first name. It is too short.\n";
            else
                output2 = "The last name must be filled in.\n";
        }

        if (flag3 != 1)
        {
            if (flag1 == 0)
                output3 = "The ZIP code must be numeric.\n";
            else
                output3 = "The ZIP code must be filled in.\n";
        }

        if (flag4 != 1)
        {
            if (flag1 == 0)
                output4 = empID + " is not a valid ID.";
            else
                output4 = "The employee ID must be filled in.";
        }
    }

    public void validateInput(int flag1, int flag2, int flag3, int flag4)
    {
        if (flag1 == 1 && flag2 == 1 && flag3 == 1 && flag4 == 1)
        {
            outFinal = "There were no errors found.";
        }
        else
        {
            parseFlags(flag1, flag2, flag3, flag4);
            outFinal = output1 + output2 + output3 + output4;
        }
    }


}
