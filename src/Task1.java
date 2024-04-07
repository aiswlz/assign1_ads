import java.util.*;

public class Task1 {
    /**
     * find the minimum number in the array
     * @param n array size
     * @param min find the min number
     * @param arr array
     * @return return the answer
     */
    public static int minNum(int n,int min,int[] arr){
        for(int i=0;i<n;i++){
            if(arr[i]<min) {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int minimum = arr[0];
        int result = minNum(n,minimum,arr);
        System.out.println(result);
    }
}
