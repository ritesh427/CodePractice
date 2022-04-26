import java.util.Scanner;

public class NumberOfAccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (a == -1 || b == -1 || c == -1 || d == -1) {
                for (int x = 1;; x++) {
                    for (int y = x;; y++) {
                        if (x + y == a || x + y == b || x + y == c || x + y == d) {
                            if (x - y == a || x - y == b || x - y == c || x - y == d) {
                                if (x * y == a || x * y == b || x * y == c || x * y == d) {
                                    if (x / y == a || x / y == b || x / y == c || x / y == d) {
                                        System.out.println(x + " " + y);
                                    } else
                                        break;
                                } else
                                    break;
                            } else
                                break;
                        } else
                            break;
                    }
                }
            } else
                System.out.println(-1 + " " + -1);
        }
        sc.close();
    }

}