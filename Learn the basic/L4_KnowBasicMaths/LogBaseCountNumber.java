
public class LogBaseCountNumber {

    // Use logarithm base 10 to count the number of digits. As
    // The number of digits in an integer = the upper bound of log10(n).

    public static int countNumberUsingLogBase(int n) {

        int count = (int) Math.floor(Math.log10(n) + 1);
        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is " + countNumberUsingLogBase(n));
    }
}
