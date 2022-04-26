import java.util.Scanner;

public class minimumAlter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int o=0,z=0,ans=0;
            char arr[] = new char[n];
            for (int j = 0; j < n; j++) {
                arr[j]=s.charAt(j);
                if(arr[j]=='0')
                o++;
                else
                z++;
            }
            if(o>z)
            ans=2*z;
            else
            ans=2*o;
            System.out.println(ans);
            
        }
    }
    
}
