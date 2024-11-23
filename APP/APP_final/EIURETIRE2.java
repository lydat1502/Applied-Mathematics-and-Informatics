
import java.util.Scanner;

public class EIURETIRE2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        double interest_rate = sc.nextDouble() / 1200;
        double inflation_rate = sc.nextDouble() / 1200;

        double bank = 0;
        double rate = 0;

        for (int i = 0; i < month; i++) {
            double money = sc.nextDouble();
            bank += money * Math.pow(1 + interest_rate, 1199 - i);
        }
        for (int j = 0; j < 1200; j++) {
            rate += Math.pow((1 + inflation_rate), j) * Math.pow((1 + interest_rate), 1199 - j);
        }

        double pay = bank / rate;
        System.out.println((long) (pay));
    }
}
