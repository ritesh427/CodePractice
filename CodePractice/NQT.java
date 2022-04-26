import java.util.Scanner;
class NQT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = a,n;
        long cnt=0,ne=0,no=0;
        while(b>0){
            b=b/10;
            cnt++;
        }
        for (int i = 0; i < cnt; i++) {
            n = a%10;
            a = a/10;
            //System.out.print(n);
            if(i%2==0)
            ne = ne+n;
            else
            no= no+n;
        }
        System.out.println(Math.abs(ne-no));
         sc.close();
     }
}