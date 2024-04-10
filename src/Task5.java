import java.util.Scanner;

public class Task5 {
    /**
     * This method calculates the nth Fibonacci number using recursion.
     * Time complexity: O(n), where n is the input number.
     * Due to the repeated function calls, this method results in exponential time complexity.
     *
     * @param n The index of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    public static int FindFibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else
            return FindFibonacci(n-1)+ FindFibonacci(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FindFibonacci(n));
    }
}
