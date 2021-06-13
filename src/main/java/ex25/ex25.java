/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */
package ex25;

import javafx.css.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex25
{
    public static passwordValidator newPassword = new passwordValidator();
    Scanner inputString = new Scanner(System.in);

    public static void main(String[] args)
    {
        int checker;
        newPassword.password = "1337h@xor!";

        checker = newPassword.passwordStrength(newPassword.password);

        System.out.printf("This should be %d", checker);
    }
}

class passwordValidator
{
    String password;

    public int passwordStrength(String password)
    {
        int length;
        char[] arrayForm;
        int i = -1;
        int numOfNums = 0;
        boolean num;
        boolean wrd;
        boolean spCh;

        Pattern numbers = Pattern.compile("\\d+");
        Pattern words = Pattern.compile("\\w+");
        Pattern spChar = Pattern.compile("\\p{all}");

        Matcher match = numbers.matcher(password);
        num = match.matches();

        match = words.matcher(password);
        wrd = match.matches();

        match = spChar.matcher(password);
        spCh = match.matches();


        arrayForm = password.toCharArray();
        length = password.length();

        if (length < 8)
        {
            if (num)
                return 0;
            if (wrd)
                return 1;
        }

        if (length >= 8)
        {
            if (wrd)
            {
                for (i = 0; i < length; i++)
                    if (Character.isDigit(arrayForm[i]))
                        numOfNums++;
                if (numOfNums >= 1)
                    return 3;
                else
                    return 4;
            }
        }

        return i;
    }

    public void outputResult(String password)
    {

    }


}

