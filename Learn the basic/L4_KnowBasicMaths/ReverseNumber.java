
public class ReverseNumber {

    // Problem Statement: Given a number N reverse the number and print it.

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
        int n = 123;
        System.out.println("Reverse of " + n + " is " + reverseDigits(n));
    }

}
