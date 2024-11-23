
import java.util.Scanner;

public class EIUINV1 {

    static double find_sum(long[] arr, double r) {
        double sum = 0.0;
        for (int i = 0; i < 12; i++) {
            sum += arr[i] * Math.pow(1 + r, 11 - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        long[] arr_money = new long[12];
        for (int i = 0; i < 12; i++) {
            arr_money[i] = sc.nextLong();
        }

        double tolerance = 1e-6;
        double left = 0.0;
        double right = 1.0;
        double rate = 0.0;

        while ((right - left) > tolerance) {
            rate = (left + right) / 2.0;
            double sum = find_sum(arr_money, rate);
            if (sum < money) {
                left = rate;
            } else {
                right = rate;
            }
        }
        System.out.printf("%.3f", rate);
    }
}
