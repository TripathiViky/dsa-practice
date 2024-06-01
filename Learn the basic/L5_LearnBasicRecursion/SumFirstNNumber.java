public class SumFirstNNumber {

    static void printSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // printSum(sum);
        System.out.println(sum);

    }

    static void printSumUsingFormula(int N) {

        int sum = N * (N + 1) / 2;
        // System.out.println("The sum of the first " + N + " numbers is: " + sum);

        // printSum(sum);
        System.out.println(sum);

    }

    static void printSumUsingParameterizedRecursion(int i, int sum) {

        if (i < 1) {
            System.out.println(sum);
            return;
        }

        printSumUsingParameterizedRecursion(i - 1, sum + i);

    }

    static int printSumUsingFunctionalRecursion(int n) {

        if (n == 0) {
            return 0;
        }

        return n + printSumUsingFunctionalRecursion(n - 1);
    }

    public static void main(String[] args) {
        printSum(5);
        printSumUsingFormula(5);
        printSumUsingParameterizedRecursion(5, 0);
        System.out.println(printSumUsingFunctionalRecursion(5));
    }

}
