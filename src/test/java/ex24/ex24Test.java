package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ex24Test
{

    @Test
    public void output_anagrams()
    {
        ex24 myBase = new ex24();
        boolean correct = true;
        boolean wrong = false;

        boolean actual = myBase.isString("bob", "joe");
        assertEquals(wrong, actual);

        actual = myBase.isString("Jerry Jones", "jones jerry");
        assertEquals(correct, actual);

        actual = myBase.isString("bob", "joe");
        assertEquals(wrong, actual);

        actual = myBase.isString("thisisatestword", "isathiswordtest");
        assertEquals(correct, actual);

        actual = myBase.isString("this is a test word", "is a this word test");
        assertEquals(correct, actual);

        actual = myBase.isString("no", "yes");
        assertEquals(wrong, actual);
    }
}