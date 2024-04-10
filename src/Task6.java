import java.util.Scanner;

public class Task6 {
    /**
     * This method calculates the power of a number using recursion.
     * Time complexity: O(n), where n is the exponent (a).
     *
     * @param n The base number.
     * @param a The exponent.
     * @return n raised to the power of a.
     */
    public static int FindPower(int n,int a){
        if(a==0)
            return 1;
        if(a==1)
            return n;
        else
            return n * FindPower(n,a-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(FindPower(n,a));
    }
}
