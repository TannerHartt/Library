import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class SortingTests {
    Library test;
    SortingDemo sortDemo;


    @BeforeEach
    public void setup() {
        test = new Library();
        sortDemo = new SortingDemo();
    }

    @Test
    public void sortArraySize10() {
        int[] arr = sortDemo.randomArray(10);
        sortDemo.printArray(arr);
        System.out.println();
        sortDemo.insertionSort(arr);
        sortDemo.printArray(arr);
    }

    @Test
    public void sortTest() { // Insertion Sort Test
        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] oneTen = { 9, 4, 7, 2, 10, 5, 6, 3, 8, 1 };
        assertArrayEquals(expected, sortDemo.insertionSort(oneTen));
    }

    @Test
    public void quickSortTest() {
        Random rand = new Random();
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        sortDemo.printArray(arr);
        sortDemo.quickSort(arr);
        System.out.println();
        sortDemo.printArray(arr);
    }

    @Test
    public void quickSortTest2() {
        Random rand = new Random();
        int [] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }

        int[] arr2 = sortDemo.randomArray(10);
        sortDemo.printArray(arr2);
        sortDemo.quickSort(arr2);
        System.out.println();
        sortDemo.printArray(arr2);
    }


}
