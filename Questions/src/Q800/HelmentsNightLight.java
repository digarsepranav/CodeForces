package Q800;

import java.util.Arrays;

public class HelmentsNightLight {
    public static void main(String[] args) {

    }
    private static long solve(int p, int[] a, int[] b) {
        int[][] v = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            v[i][0] = a[i];
            v[i][1] = b[i];
        }
        Arrays.sort(v, (i, j) -> Integer.compare(i[1], j[1]));
        long cost = p;
        int informed = 1;
        for (int i = 0; i < a.length && informed < a.length; i++) {
            int capacity = v[i][0];
            int shareCost = v[i][1];

            if (shareCost >= p) {
                break;
            }
            int use = Math.min(capacity, a.length - informed);
            cost += use *= shareCost;
            informed += use;
        }
        cost += (long) p * (a.length - informed);
        return cost;
}
}
