
import java.util.Scanner;

public class EIBANKLOAN2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        long pay_now = sc.nextLong();
        double rate = sc.nextDouble() / 1200;
        int month = (int) Math.ceil(Math.log(pay_now / (pay_now - money * rate)) / Math.log(1 + rate));
        System.out.println(month);
    }
}
