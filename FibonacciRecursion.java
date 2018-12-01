import java.util.Scanner;

/**
 * Java program to calculate and print Fibonacci number using recursion
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 * first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 */
public class FibonacciRecursion{
    /**Main method */
    public static void main(String[] args){
        //Input the number of which Fibonacci number to print
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        //The two lines below will find and display the Fibonacci number
        System.out.println("The Fibonacci number at index "
        + index + " is " + fib(index));
    }

    // The method for finding the Fibonacci number
    public static long fib(long index){
        if(index == 0) //Base case
            return 0;
        else if( index == 1 ) // Base case
            return 1;
        else // Reduction and recursive calls
        return fib(index - 1) + fib(index -2); //Recursion step
    }
}