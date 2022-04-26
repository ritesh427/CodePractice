package Practice;

import java.util.Scanner;

public class addornumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = 0, c = 0;
            int e = a / 10;
            while (e > 0) {
                int f = e % 10;
                if (f % 2 == 1)
                    b++;
                else
                    c++;
                e = e / 10;
            }
            if (a % 2 == 0 && c > 0)
                System.out.println("YES");
            else if (a % 2 == 1 && b > 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        scan.close();
    }
}