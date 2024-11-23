
import java.util.Scanner;

public class EIMEMCARD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int mil = 1000000;
        long[] arr_money = {0, 1 * mil, 20 * mil, 50 * mil, 200 * mil, Long.MAX_VALUE};
        double[] rate = {0, 0.02, 0.03, 0.05, 0.07};
        int num_product = sc.nextInt();
        long sum_money = 0;
        double discount = 0;
        int rank = 0;
        for (int i = 0; i < num_product; i++) {
            long money = sc.nextLong();
            sum_money += money;
            discount = money * rate[rank];
            sb.append(discount + " ");
            while (true) {
                if (sum_money >= arr_money[rank + 1]) {
                    rank++;
                } else {
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
