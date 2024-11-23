
import java.util.Scanner;

public class EIUTHU {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firtSentence = sc.nextLine();
        String secondSentence = sc.nextLine();
        int result = -1;
        for (int i = 0; i < firtSentence.length(); i++) {
            String firtEnd = firtSentence.substring(i);
            if (secondSentence.startsWith(firtEnd)) {
                result = i + secondSentence.length();
                break;
            }
        }
        if (result == -1) {
            result = firtSentence.length() + secondSentence.length();
        }
        System.out.println(result);
    }
}
