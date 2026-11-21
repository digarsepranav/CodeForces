package Q1000;
import java.util.*;

public class DoublyEndedString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();

            int a = s1.length();
            int b = s2.length();

            int count = 0;

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    int idx = i;
                    int k = j;
                    int len = 0;
                    while (idx < a && k < b && s1.charAt(idx) == s2.charAt(k)) {
                        len++;
                        k++;
                        idx++;
                    }
                    count = Math.max(count, len);
                }
            }
            System.out.println(a + b - 2 * count);
        }
    }
}
