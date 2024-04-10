import java.util.Scanner;
public class Task3 {
    /**
     * This method checks if a given number is prime.
     * Time complexity: O(sqrt(n)), where n is the number to be checked.
     * @param n The number to check for primality.
     * @return "Prime" if the number is prime, "Composite" otherwise.
     */
    public static String is_prime(int n){
        int counter=0;
        for (int i =1;i<=n;i++){
            if(n%i==0)
                counter++;
            if(counter>2)
                return "Composite";
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = is_prime(n);
        System.out.println(result);
    }
}