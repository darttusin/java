/**
 * Class Palindrome check if word is a palindrome
 */
public class Palindrome {
    /**
     * Main function processes data
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }

    /**
     * This function reverse word
     */
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     * Check if word is a palindrome
     */
    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }
}
