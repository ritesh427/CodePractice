import java.util.Scanner;

public class matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            arr[i]=c;
        }
        for (int i = 0; i < n; i++) {
            //System.out.println(arr[i]);
            String c = Integer.toString(arr[i]);
            int a = c.length();
            int mCount=0;
            for (int j = 0; j < a; j++) {
                if(c.charAt(j)=='0'){
                    mCount = 6;
                }else if(c.charAt(j)=='1'){
                    mCount += 2;
                }else if(c.charAt(j)=='2'){
                    mCount += 5;
                }else if(c.charAt(j)=='3'){
                    mCount += 5;
                }else if(c.charAt(j)=='4'){
                    mCount += 4;
                }else if(c.charAt(j)=='5'){
                    mCount += 5;
                }else if(c.charAt(j)=='6'){
                    mCount += 6;
                }else if(c.charAt(j)=='7'){
                    mCount += 3;
                }else if(c.charAt(j)=='8'){
                    mCount += 7;
                }else if(c.charAt(j)=='9'){
                    mCount += 6;
                }
            }
            System.out.println(Integer.toString(mCount));
            
        }

    }
}
