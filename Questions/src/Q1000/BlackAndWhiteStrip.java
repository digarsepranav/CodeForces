package Q1000;
import java.util.*;

public class BlackAndWhiteStrip {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int i = 0;
            int c_B = 0;
            int ans = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                char ch = s.charAt(j);
                if (ch == 'B') {
                    c_B++;
                }
                if (j-i+1 >= k) {
                    ans = Math.min(k-c_B, ans);
                    if (s.charAt(i) == 'B') {
                        c_B--;
                    }
                    i++;
                }
            }
            System.out.println(ans);
        }
    }
}
