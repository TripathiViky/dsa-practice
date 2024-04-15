public class FindGCD {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 3, num2 = 6;
        int ans = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }
        System.out.println("The GCD of the two number is " + ans);

        // Using Euclidean's theorem

        int answ = gcd(num1, num2);
        System.out.println("The GCD of the two numbers using Euclidean's theorem is " + answ);
    }
}
