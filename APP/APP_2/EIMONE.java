
import java.util.Scanner;

public class EIMONE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int[] denominations = {20, 10, 5, 1};
        for (int i = 0; i < denominations.length; i++) {
            long quality = money / denominations[i];
            money = money % denominations[i];
            if (quality > 0) {
                System.out.println(denominations[i] + " " + quality);
            }
        }
    }
}
