
import java.util.Scanner;

public class EISARR {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int length_sub = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long max_sum = 0;
        for (int j = 0; j < length_sub; j++) {
            max_sum += arr[j];
        }

        long current_sum = max_sum;
        for (int i = 0; i < n - length_sub; i++) {
            current_sum = current_sum - arr[i] + arr[i + length_sub];
            max_sum = Math.max(max_sum, current_sum);
        }

        System.out.println(max_sum);
    }
}
