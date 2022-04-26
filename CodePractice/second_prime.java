import java.util.*;

public class second_prime {
    public static second_prime.Num getSecondLargest(second_prime.Num[] n, int total) {
        second_prime.Num temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (n[i] > n[j]) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        return n[total - 2];
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Num[] n =new Num[7];
       for(int i=0;i<6;i++){
           int no =sc.nextInt();
           sc.nextLine();
        n[i]=new Num(no);
       }
        sc.close();
        System.out.println("Second Largest: " + getSecondLargest(n, 7));
    }

    class Num{
        int no;
        public Num(int no){
            this.no=no;
        }
    }
}