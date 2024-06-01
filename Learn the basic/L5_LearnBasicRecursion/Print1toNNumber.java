public class Print1toNNumber {

    static void print(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 4;
        print(1, n);
    }

}
