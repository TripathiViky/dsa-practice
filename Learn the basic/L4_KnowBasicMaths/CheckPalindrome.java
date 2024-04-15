
public class CheckPalindrome {

    // Check if a number is Palindrome or Not

    public static int reverseDigits(int n) {

        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = (reverse * 10) + digit;
            n = n / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        int X = 12321;
        int Y = reverseDigits(X);
        if (X == Y) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }

}
