import jdk.jfr.StackTrace;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;


import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {

    Library fizzBuzz, test;


    @BeforeEach
    public void setup() {
        fizzBuzz = new Library();
        test = new Library();
    }



    @Test
    public void listRepeatingTest() {
        String[] list = {"Tanner", "Kevin", "Jojo"};
        System.out.println(Arrays.toString(test.listRepeating(list)));
    }



    @Test
    public void factorialITest() {
        assertEquals(1, test.factorialI(1));
        assertEquals(1, test.factorialI(0));
        assertEquals(24, test.factorialI(4));
        assertEquals(3628800, test.factorialI(10));
        assertEquals(-3628800, test.factorialI(-10));
        assertEquals(-24, test.factorialI(-4));
        assertEquals(-2, test.factorialI(-2));
    }


    @Test
    public void factorialRTest() {
        assertEquals(1, test.factorialR(1));
        assertEquals(1, test.factorialR(0));
        assertEquals(24, test.factorialR(4));
        assertEquals(3628800, test.factorialR(10));
    }


    @Test
    public void reversePalindromeTest() {
        assertTrue(test.reversePalindrome("wow"));
        assertTrue(test.reversePalindrome("raCEcar"));
        assertTrue(test.isPalindrome("44222244"));
        assertTrue(test.isPalindrome("madam"));
        assertTrue(test.isPalindrome("noon"));
        assertTrue(test.isPalindrome("rAdAr"));
        assertTrue(test.isPalindrome("lEVEl"));

        if (test.isPalindrome("racecar")) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("It is not");
        }
    }

    @Test
    public void test() {
        assertEquals("olleHThereneirFd", test.reverseCharInString("HelloThereFriend", 5));
        assertEquals("TolleHhereFrdnei", test.reverseCharInString("HelloThereFriend", 6));
        assertEquals("HiThere", test.reverseCharInString("iHThree", 2));
        assertEquals("123456", test.reverseCharInString("213465", 2));
    }


    @Test
    public void testst() {

    // x = 0 1 2 3         for loop #
        // 0 1 2 3 4    index
        // H e l l o    word
        // B i t c h    word

        // h c t i B           // reverse
        // h             // v
        // h c t i B            v + reverse

    }



    @Test
    public void substringTest() {
        assertEquals("ch woo",test.partString("How much wood would a woodchuck chuck",6,12));
        assertEquals("How much wood would",test.partString("How much wood would a woodchuck chuck",0,19));
        assertEquals("I love chicken",test.partString("You know I love chicken but I dont want that right now",9,23));
    }

    @Test
    public void givenInputIsThree_expectFizz() {
        int input = 3;
        String output = fizzBuzz.fizzBuzz(input);
        assertEquals("Fizz", output);
    }

    @Test
    public void givenInputIsFive_expectBuzz() {
        int input = 5;
        String output = fizzBuzz.fizzBuzz(input);
        assertEquals("Buzz", output);
    }

    @Test
    public void givenMultipleOfThree_thenFizz() {
        assertEquals("Fizz", test.fizzBuzz(3));
        assertEquals("Fizz", test.fizzBuzz(6));
        assertEquals("Fizz", test.fizzBuzz(999));
    }

    @Test
    public void givenMultipleOfFive_thenBuzz() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(100));
    }

    @Test
    public void givenMultipleOfThreeAndFive_thenFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(45));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(90));
    }

    @Test
    public void givenInputNoneMultipleOfThreeOrFive_thenNum() {
        assertEquals("1", fizzBuzz.fizzBuzz(1));
        assertEquals("4", fizzBuzz.fizzBuzz(4));
        assertEquals("7", fizzBuzz.fizzBuzz(7));
        assertEquals("98", fizzBuzz.fizzBuzz(98));
    }

    @Test
    public void givenMultiplesOfThreeButNotFive() {
        for (int i = 1; i <= 100; i++) {  // a simple counter that counts to 100 and runs a test each number that is a multiple of 3 but not 5.
            if ((i % 3 == 0) && !(i % 5 == 0)) {
                assertEquals("Fizz", fizzBuzz.fizzBuzz(i));
            }
        }
    }

    @Test
    public void givenMultiplesOfFiveButNotThree() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 == 0) && !(i % 3 == 0)) {
                assertEquals("Buzz", fizzBuzz.fizzBuzz(i));
            }
        }
    }


    @Test
    public void givenString_expectFalse() {
        assertFalse(test.isPalindrome("Hello World"));
        assertFalse(test.isPalindrome("My name is Tanner"));
        assertFalse(test.isPalindrome("Racecars"));
        assertFalse(test.isPalindrome("boop"));
        assertFalse(test.isPalindrome("CloSe"));

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Tanner", 24);
        System.out.println(map);

    }

    @Test
    public void givenString_expectTrue() {
        assertTrue(test.isPalindrome("Racecar"));
        assertTrue(test.isPalindrome("Boob"));
        assertTrue(test.isPalindrome("a"));
        assertTrue(test.isPalindrome("dD"));
        assertTrue(test.isPalindrome("Bb"));
        assertTrue(test.isPalindrome("44222244"));
        assertTrue(test.isPalindrome("madam"));
        assertTrue(test.isPalindrome("noon"));
        assertTrue(test.isPalindrome("rAdAr"));
        assertTrue(test.isPalindrome("lEVEl"));
    }

    @Test
    public void givenString_returnIfPalindrome() {

        assertTrue(test.isPalindrome("Wow"));
        assertTrue(test.isPalindrome("raceCar"));
        assertTrue(test.isPalindrome("RacEcar"));
        assertFalse(test.isPalindrome("Nope"));
        assertFalse(test.isPalindrome("Wrong input"));
        assertTrue(test.isPalindrome("048840"));
        assertFalse(test.isPalindrome("Wrong again idiot"));
    }

    @Test
    public void givenHello_expectOlleh() {
        assertEquals("olleH",test.reverseString("Hello"));
    }

    @Test
    public void reverseString() {
        assertEquals("orb oY", test.reverseString("Yo bro"));
        assertEquals("dlroW olleH", test.reverseString("Hello World"));
        assertEquals("goD giB", test.reverseString("Big Dog"));
        assertEquals("?gnikrow gniht siht sI", test.reverseString("Is this thing working?"));
    }

    @Test
    public void fibonacciTest() {
        assertEquals(55, test.fibonacciR(10));
        assertEquals(13, test.fibonacciR(7));
        assertEquals(34, test.fibonacciR(9));
        assertEquals(0, test.fibonacciR(0));
        assertEquals(102334155, test.fibonacciR(40));
        assertEquals(1, test.fibonacciR(2));
        assertEquals(46368, test.fibonacciR(24));
        assertEquals(1597, test.fibonacciR(17));
    }

    @Test
    public void randomGeneratorTest() {
        System.out.println(test.randomMinMax(12,20));
        System.out.println(test.randomMinMax(100,200));
        System.out.println(test.randomMinMax(10,12));
        System.out.println(test.randomMinMax(1,10));
        System.out.println(test.randomMinMax(10000,12513));
    }
}
