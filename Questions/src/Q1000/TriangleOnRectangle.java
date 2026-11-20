package Q1000;
import java.util.*;
public class TriangleOnRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            int xn0 = sc.nextInt();
            int xMax = 0;
            int[] x0 = new int[xn0];
            for (int i = 0; i < xn0; i++) {
                x0[i] = sc.nextInt();
            }
            int xnh = sc.nextInt();
            int[] xh = new int[xnh];
            for (int i = 0; i < xnh; i++) {
                xh[i] = sc.nextInt();
            }
            xMax = Math.max(x0[xn0-1] - x0[0], xh[xnh-1] - xh[0]);

            int yn0 = sc.nextInt();
            int yMax = 0;
            int[] y0 = new int[yn0];
            for (int i = 0; i < yn0; i++) {
                y0[i] = sc.nextInt();
            }
            int ynh = sc.nextInt();
            int[] yh = new int[ynh];
            for (int i = 0; i < ynh; i++) {
                yh[i] = sc.nextInt();
            }
            yMax = Math.max(y0[yn0-1] - y0[0], yh[ynh-1] - yh[0]);

            long area1 = (long) xMax * h;
            long area2 = (long) yMax * w;

            System.out.println(Math.max(area1, area2));
        }
    }
}
