import java.util.Scanner;

public class letterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // long count[] = new long[1000];
        for (int i = 0; i < T; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long ea = a / 2;
            long eb = b / 2;
            long oa = (a + 1) / 2;
            long ob = (b + 1) / 2;
            long res = ea * eb + oa * ob;
            System.out.println(res);

            // for (int j = 1; j <= a; j++) {
            // for (int j2 = 1; j2 <= b; j2++) {
            // if ((j + j2) % 2 == 0)
            // c++;
            // }
            // }
            // count[i] = c;
            // c = 0;
            // // System.out.println(c);
            // }
            // for (int i = 0; i < T; i++) {
            // System.out.println((int)count[i]);
            // }
            sc.close();
        }
    }
}