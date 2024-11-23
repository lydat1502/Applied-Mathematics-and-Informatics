
import java.util.Scanner;

public class EIPOINT {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        int[] table_of_point = {90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50};
        String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-"};
        if (point < 50 && point >= 0) {
            System.out.println("F");
        }
        for (int i = 0; i < table_of_point.length; i++) {
            if (point / table_of_point[i] > 0) {
                System.out.println(grades[i]);
                break;
            }
        }
    }
}
