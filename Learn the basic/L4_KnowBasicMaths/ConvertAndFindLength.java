public class ConvertAndFindLength {

    // Convert the integer into a string.
    // Find the length of the string
    public static int convertToStringCountLength(int n) {

        String convertedString = Integer.toString(n);

        return convertedString.length();
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is " + convertToStringCountLength(n));
    }
}
