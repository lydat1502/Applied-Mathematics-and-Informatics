
import java.util.Scanner;

public class EIAPP21222FQ2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        double money = 0;
        double sum_money = 0;
        double[] rate = {0, 3.9, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92};
        for (int i = 0; i < month; i++) {
            money = sc.nextLong();
            int currMonth = month - i;
            int year = currMonth / 12;
            if (year > 0) {
                money *= Math.pow((1 + 0.0692), year);
            }
            currMonth %= 12;
            sum_money += money * (1 + rate[currMonth] * currMonth / 1200);
        }
        System.out.println(Math.round(sum_money));
    }
}
