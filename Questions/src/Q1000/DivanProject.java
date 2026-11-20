package Q1000;
import java.lang.reflect.Array;
import java.util.*;
public class DivanProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = i+1;
            }
            Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

            long incMinute = 0;
            long decMinute = 0;
            long[] ans = new long[n+1];
            ans[0] = 0;
            long res = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    ans[arr[i][1]] = incMinute+1;
                    incMinute+=1;
                    res += 2L * (arr[i][0]) * Math.abs(incMinute);
                }
                else {
                    ans[arr[i][1]] = decMinute-1;
                    decMinute-=1;
                    res += 2L * (arr[i][0]) * Math.abs(decMinute);
                }
            }
            System.out.println(res);
            for (int i = 0; i < n+1; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
