import java.util.Scanner;

public class Task10 {
    /**
     * This method implements the Euclidean algorithm to efficiently calculate the greatest common divisor (GCD) of two non-negative integers.
     * Time complexity: O(a, b), where a and b are the input integers.
     *
     * @param a The first non-negative integer.
     * @param b The second non-negative integer.
     * @return The greatest common divisor of a and b.
     */
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
}
