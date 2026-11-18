package Q800;

import java.util.*;
public class Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int[] ans = solve(arr, k);
            for (int l = 0; l < ans.length; l++) {
                System.out.print(ans[l]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static int[] solve(int[] arr, int k) {
        int[][] ans = new int[arr.length][2];

        for (int i = 0; i < ans.length; i++) {
            ans[i][0] = arr[i] % k;
            ans[i][1] = i;
        }
        Arrays.sort(ans, (x, y) -> Integer.compare(x[0], y[0]));

        int[] result = new int[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = ans[i][1]+1;
        }
        return result;
    }
}
