package Q1000;
import java.util.*;

public class MEXorMixup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int n = a-1;
            int xor = compueXor(n);
            if (xor == b) {
                System.out.println(a);
            }
            else if (xor != b && (xor ^ b) != a ) {
                System.out.println(a+1);
            }
            else if (xor != b && (xor ^ b) == a) {
                System.out.println(a+2);
            }
        }
    }
    private static int compueXor(int n) {
        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n+1;
        }
        return 0;
    }
}
