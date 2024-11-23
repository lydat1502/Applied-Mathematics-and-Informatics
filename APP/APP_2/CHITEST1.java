
import java.util.Scanner;

public class CHITEST1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.println(num1 + num2);
        }
    }
}
