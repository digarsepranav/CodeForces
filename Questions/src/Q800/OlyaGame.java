package Q800;

import java.util.*;

public class OlyaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<int[]> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int m = sc.nextInt();
                int[] arr = new int[m];
                for (int k = 0; k < m; k++) {
                    arr[k] = sc.nextInt();
                }
                list.add(arr);
            }
            System.out.println(solve(list));
        }
    }
    private static long solve(ArrayList<int[]> list) {
        int minOfmin2 = Integer.MAX_VALUE;
        long sumOfmin2 = 0;
        int minOfmin1 = Integer.MAX_VALUE;

        for (int[] arr : list) {
            Arrays.sort(arr);
            minOfmin2 = Math.min(arr[1], minOfmin2);
            minOfmin1 = Math.min(arr[0], minOfmin1);
            sumOfmin2 += arr[1];
        }
        return sumOfmin2 - minOfmin2 + minOfmin1;
    }
}