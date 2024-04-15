public class CheckPrime {

    static boolean isPrimeNumberBruteForce(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isPrimeNumberOptimal(int n) {

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 18;
        boolean ans = (isPrimeNumberBruteForce(n));
        boolean ans1 = (isPrimeNumberOptimal(n));
        if (n != 1 && ans == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Composite Number");
        }

        if (n != 1 && ans1 == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Composite Number");
        }
    }
}
