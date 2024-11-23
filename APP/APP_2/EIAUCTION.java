
import java.util.Scanner;

public class EIAUCTION {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_roll = sc.nextInt();
        int[] xx = new int[7];
        int[] each_roll = new int[num_roll];
        for (int i = 0; i < num_roll; i++) {
            each_roll[i] = sc.nextInt();
            xx[each_roll[i]] += 1;
        }
        int vt = 0;
        for (int j = 6; j >= 1; j--) {
            if (xx[j] == 1) {
                vt = j;
                break;
            }
        }
        for (int i = 0; i < num_roll; i++) {
            if (vt == each_roll[i]) {
                vt = i + 1;
                break;
            }
        }
        if (vt == 0) {
            System.out.println("none");
        } else {
            System.out.println(vt);
        }
    }
}
