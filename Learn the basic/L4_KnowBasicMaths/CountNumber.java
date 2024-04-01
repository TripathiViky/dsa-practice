public class CountNumber {

    // Problem Statement: Given an integer N, write a program to count the number of
    // digits in N.
    public static int countIntegers(int n) {

        int x = n;
        int count = 0;

        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is " + countIntegers(n));
    }
}
