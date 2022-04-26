import java.util.Scanner;

public class DCAOLD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int a = 0;
        boolean flag = false;
        for (int i = 0; i < f; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length() - 2; j++) {
                if (j < s.length() - 3) {
                    if (s.charAt(j) == '0' && s.charAt(j + 1) == '1' && s.charAt(j + 2) == '0' || s.charAt(j) == '1' && s.charAt(j + 1) == '0' && s.charAt(j + 2) == '1')
                        flag = true;
                    break;
                }
            }
            if (flag == true)
                System.out.println("Good");
            else
                System.out.println("Bad");
        }
        sc.close();
    }
}
