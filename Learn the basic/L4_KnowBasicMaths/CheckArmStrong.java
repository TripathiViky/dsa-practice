public class CheckArmStrong {

    static boolean isArmStrong(int num) {

        int initialNum = num;
        int count = 0;
        int temp = num;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int sumofpower = 0;
        while (num != 0) {
            int digit = num % 10;
            sumofpower += Math.pow(digit, count);
            num /= 10;
        }

        return (sumofpower == initialNum);
    }

    public static void main(String[] args) {

        System.out.println("Is number Armstrong? " + isArmStrong(153));
    }

}
