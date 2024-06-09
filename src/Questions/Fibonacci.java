
package Questions;


import java.util.Scanner;

public class Fibonacci {
    // Function to print the Fibonacci series up to n terms
    public static void FibonacciSeries(int n){
        int first = 0, second = 1;

        System.out.print("Fibonacci series of " + n + " terms: ");

        for(int i = 1; i <= n; i++){
            System.out.print( first +" ");

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
        // Move to the next line after printing the series
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        FibonacciSeries(n);

        sc.close();

    }
}

