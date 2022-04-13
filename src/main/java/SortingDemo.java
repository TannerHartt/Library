import java.util.Random;

public class SortingDemo {
    Library test = new Library();


    /**
     * Simple utility method that you to pass only the array you wish to sort.
     * It then calls the recursive method that does the sorting while passing in the extra needed
     * parameters for the method to sort correctly.
     * Every array that needs to be sorted will start with the same lowIndex and highIndex.
     * @param arr Array to be sorted.
     */
    public void quickSort(int [] arr){
        quickSort(arr, 0 , arr.length - 1);
    }

    /**
     *
     * @param arr Int array to be sorted.
     * @param lowIndex The starting place or the algorithm / The first element in the array. (Same for every call).
     * @param highIndex The second to last element in the array. (Same of every call).
     */
    public void quickSort(int[] arr, int lowIndex, int highIndex) {  // Swap Sort
        if (lowIndex >= highIndex) return;

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        swap(arr,pivotIndex,highIndex);

        while(leftPointer < rightPointer){
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        quickSort(arr,lowIndex, leftPointer - 1);
        quickSort(arr,leftPointer + 1, highIndex);

    }


    /**
     * A method used to sort an integer array by iterating through the array one element at a time and checking if it is
     * bigger or smaller than the previous element.
     * If the previous element is bigger than the current element it swaps them, making those two elements sorted.
     * It then repeats this process until it has reached the end of the array, where there are no more shifts to be made.
     * @param inputArr Desired array to be sorted.
     * @return returns the array, sorted.
     */
    public int[] insertionSort(int[] inputArr) {
        for (int i = 1; i < inputArr.length; i++) {
            int curr = inputArr[i];

            int prev = i - 1;
            while (prev >= 0 && inputArr[prev] > curr) {
                inputArr[prev + 1] = inputArr[prev];
                prev--;
            }
            inputArr[prev + 1] = curr;
        }
        return inputArr;
    }

    /**
     * Utility method used to swap the indexes of two numbers in an array.
     * @param arr Array to be sorted.
     * @param index1 Left index to be replaced by index2.
     * @param index2 Right index to be replaced by index1.
     */
    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * Utility method to print the elements of an array one line at a time.
     * @param numbers Integer array to be printed.
     */
    public void printArray(int[] numbers) { for (int number : numbers) System.out.println(number); }


    /**
     * Utility method that creates an integer array with random values.
     * @param sizeOfArrayAndBound Sets the size of the array and the bound of the random values in the array.
     *                            The bound is between one and the passed value.
     * @return An array filled with random values.
     */
    public int[] randomArray(int sizeOfArrayAndBound) {
        int[] arr = new int[sizeOfArrayAndBound];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = test.randomMinMax(1, sizeOfArrayAndBound);
        }
        return arr;
    }

}

