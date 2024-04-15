public class PrintDivisor {

    public static void main(String[] args) {
        printDivisorsBruteForce(36);
        printDivisorsOptimal(36);
    }

    static void printDivisorsBruteForce(int num) {

        System.out.println("The divisors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    static void printDivisorsOptimal(int num) {

        System.out.println("The divisors of " + num + " are: ");
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
                if (i != num / i) {
                    System.out.println(num / i + " ");
                }
            }
        }
        System.out.println();
    }

}
