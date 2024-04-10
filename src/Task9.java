import java.util.Scanner;

public class Task9 {
    /**
     * This method calculates the binomial coefficient using recursion.
     * Time complexity: O(n), where n is the input number.
     *
     * @param n The first number for the binomial coefficient.
     * @param k The second number for the binomial coefficient.
     * @return The binomial coefficient of n and k.
     */
    public static int Binomial_Coefficient(int n,int k){
        if(n==0||n==1)
            return 1;
        if(k==0)
            return 1;
        if(n==k)
            return 1;
        else
            return Binomial_Coefficient(n-1,k-1)+Binomial_Coefficient(n-1,k);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(Binomial_Coefficient(n,k));
    }
}
