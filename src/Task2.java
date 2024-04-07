import java.util.Scanner;

public class Task2 {
    /**
     * find average of array
     * @param n size of array
     * @param arr array
     * @return return average of numbers
     */
    public static double FindAverage(int n, int[] arr){
        double sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        double result = FindAverage(n,arr);
        System.out.println(result);
    }
}
