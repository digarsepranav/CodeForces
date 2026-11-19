package Q1000;
import java.util.*;
public class RoofConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int msbVal = Integer.highestOneBit(n - 1);

            for (int i = msbVal-1; i >= 0; i--) {
                System.out.print(i + " ");
            }
            System.out.print(msbVal + " ");
            for (int i = msbVal + 1; i < n; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
