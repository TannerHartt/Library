# My Function Library



### LinkedList Demo
- Contains functions that can be used on linked lists that aren't in default Java library.
- List - a collection of elements (data nodes) where insertion order is respected.
- demos.LinkedListDemo - each node holds data, and a reference to the next node.

### Fibonacci Series
- A sequence in which each number is the sum of the two preceding numbers.
- The sequence commonly starts like `0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...`
- With my function we can pass in a number and get its Fibonacci number back recursively.

### Random Number Generator
- A random number generator that uses a simple math function that allows us to pass in two
  numbers, and it will generate an integer between those values.

### Palindrome Checker
- A word is considered a palindrome if it can be written backwards and still be the
  same word.
- Some examples include:
    - `racecar`  `wow`
    - `level`  `radar`
    - `Madam`  `4004`
    - `Noon`  `Anna`

- This function returns true if the string is a palindrome, otherwise false.
- The function is case resistant (not case-sensitive) and character resistant (&, %, _ ).


### Factorial
- Factorial, in mathematics, is described as the product of all positive integers less than or equal
  to a given integer.
- Factorial is often denoted using the `!` following the given number.
- For Example:
  - `10! = 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 x 9 x 10`
  - `7! = 1 x 2 x 3 x 4 x 5 x 6 x 7`
  - `3! = 1 x 2 x 3`
  
- Factorial numbers grow exponentially, so they quickly get to be very big numbers.
- This program offers an iterative solution and a recursive solution.


### Sudoku Solver
- This function takes in a Sudoku board in the form of a 2D int array.
- Inputted board must be a valid solvable Sudoku board for the function to work.
- Empty spaces are represented by a `0` in the array.
- The function recursively finds the solution to any valid board by constantly checking
  if the row, column, and 3x3 quadrant contains duplicate numbers each time it tries
  inserting a number into a space.
- If the row, column, or quadrant contain the attempted number, the attempted number will
  increment by one and re-checking.
- This process repeats until it can fill every space without failing a check.


### Quick Sort for Integer Arrays
- O(n log(n)) time complexity on average. O(n^2) worst case.
- This sorting algorithm selects an element at random to be used as our `pivot` point.



### Insertion Sort for Integer Arrays
- O(n^2) time complexity in its average and worst case scenarios.
    - In most cases, a faster sorting algorithm is necessary.
- This sorting algorithm sorts an array of integers by iterating through the array one
  element at a time.
- With each iteration it checks if the element is `>` or `<` the previous element.
- If the previous element is smaller than the current it swaps their place and recursively
  checks subsequent previous elements until they are in order and no more swaps are to be made.
- When all numbers in the sub-array are sorted it iterates to the next element and repeats the process.


- The image below illustrates the iteration process used for insertion sort:

![alt text](https://media.geeksforgeeks.org/wp-content/uploads/insertionsort.png)


