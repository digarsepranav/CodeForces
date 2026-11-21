package Q1000;
import java.util.*;

public class AddAndDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        while (j-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < 100; i++) {
                int newB = b + i;

                if (newB == 1) {
                    continue;
                }

                int temp = a;
                int count = i;

                while (temp > 0) {
                    temp /= newB;
                    count++;
                }
                ans = Math.min(ans, count);
            }
            System.out.println(ans);
        }
    }
}
