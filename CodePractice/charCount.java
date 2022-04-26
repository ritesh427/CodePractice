import java.util.Scanner;

public class charCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                if (s.charAt(i)==s.charAt(j)) 
                    count ++;
            }
            System.out.println(s.charAt(i)+" "+count);
            count=0;
        }
        sc.close();
    }
    
}
