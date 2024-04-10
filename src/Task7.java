import java.util.Scanner;

public class Task7{
    /**
     * This method recursively reverses the elements of a given array.
     * Time complexity: O(n), where n is the length of the array.
     *
     * @param arr The array to be reversed.
     * @param start The starting index of the subarray to reverse.
     * @param end The ending index of the subarray to reverse.
     */
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        reverseArray(arr, start,end);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}