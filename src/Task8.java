import java.util.Scanner;;

public class Task8 {
    /**
     * This method checks if a given string consists entirely of digits (0-9).
     * Time complexity: O(n), where n is the length of the input string.
     *
     * @param str The string to be checked.
     * @return "Yes" if the string contains only digits, "No" otherwise.
     */
    public static String isAllDigits(String str) {
        if (str == null) {
            return "No";
        }
        // loop iterates over each character (c) in the string converted to a character array
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isAllDigits(str));
        }
    }

