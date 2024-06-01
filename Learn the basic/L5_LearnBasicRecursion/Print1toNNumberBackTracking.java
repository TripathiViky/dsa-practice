public class Print1toNNumberBackTracking {

    static void print(int i, int n) {
        if (i < 1)
            return;

        print(i - 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        int n = 4;
        print(n, n);
    }

}
