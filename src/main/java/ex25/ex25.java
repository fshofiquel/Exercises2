package ex25;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex25
{
    Scanner inputString = new Scanner(System.in);
    public static passwordValidator newPassword = new passwordValidator();


    public static void main(String[] args)
    {
        int checker;
        newPassword.password = "abcefg";

        checker = newPassword.passwordStrength(newPassword.password);

        System.out.printf("This should be 0 %d", checker);
    }
}

class passwordValidator
{
    String password;

    public int passwordStrength(String password)
    {
        int length;
        char[] arrayForm;
        int i = 5;

        Pattern numbers = Pattern.compile("[/d]");
        Pattern words = Pattern.compile("[/w]");

        arrayForm = password.toCharArray();
        length = password.length();

        if (length < 8)
        {
            if (password.matches(".*[0-9]+.*"))
                return 0;
            if (password.matches(".*[a-zA-Z]+.*"))
                return 1;
        }

        /*if (length >= 8)
        {
            if (password.matches(".*[a-zA-Z]+.*"))
            {

            }
        }*/

        return i;
    }

    public void outputResult(String password)
    {

    }


}

