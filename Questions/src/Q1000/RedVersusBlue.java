package Q1000;
import java.util.*;

public class RedVersusBlue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();

            int numOfR = r / (b+1);

            int rem = r % (b+1);

            StringBuilder sb = new StringBuilder();

            for (int i = 0;  i < b+1; i++) {
                int count = numOfR;
                if (rem > 0) {
                    count++;
                    rem--;
                }
                while (count-- > 0) {
                    sb.append("R");
                }
                if (i < b) {
                    sb.append("B");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
