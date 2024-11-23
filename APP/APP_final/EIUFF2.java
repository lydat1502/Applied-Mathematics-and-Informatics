
import java.util.Scanner;

public class EIUFF2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble() / 100;
        double inflation = sc.nextDouble() / 100;
        long withdraw = sc.nextLong();
        double money = withdraw / (rate - inflation);
        System.out.println((long) Math.ceil(money));
    }
}
