import java.util.*;
class DCA {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            if (sum(s) % 2 == 0) {
                int z = 1;
                while (true) {
                    if (sum(s + z) % 2 != 0) {
                        System.out.println(s + z);
                        break;
                    } else
                        z++;
                }
            } else {
                int z = 1;
                while (true) {
                    if (sum(s + z) % 2 == 0) {
                        System.out.println(s + z);
                        break;
                    } else
                        z++;
                }
            }
        }

    }
    static int sum(int n) {
        int d = 0;
        for (int j = n; j > 0; j /= 10) {
            d += j % 10;
        }
        return d;
    }
}
