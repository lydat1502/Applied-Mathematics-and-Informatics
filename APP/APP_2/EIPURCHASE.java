
import java.util.Scanner;

public class EIPURCHASE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int month = sc.nextInt();
        long pay_now = sc.nextLong();
        long pay_eachMonth = sc.nextLong();
        double rate = 0;

        double right = 1.0;
        double left = 0.0;
        double round = 1e-6;
        while (right - left > round) {
            rate = (left + right) / 2;
            double frate = (money - pay_now) * rate / (1 - Math.pow(1 + rate, -month)) - pay_eachMonth;
            if (frate > 0) {
                right = rate;
            } else {
                left = rate;
            }
        }
        System.out.println(rate);
    }
}
