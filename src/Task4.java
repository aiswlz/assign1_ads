import java.util.Scanner;

public class Task4 {
    /**
     * This method calculates the factorial of a non-negative integer using recursion.
     * Time complexity: O(n), where n is the input number.
     * @param n The non-negative integer for which to calculate the factorial.
     * @return The factorial of n.
     */
    public static int FindFactorial(int n){
        if(n==1)
            return 1;
        else
            return n*FindFactorial(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FindFactorial(n));
    }
}
