import java.util.Scanner;

public class numberDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Zero","Double","Tripple"};
        int arrInt[]={1,2,3,4,5,6,7,8,9,0};
        String num = sc.nextLine();
        int sum=0;
        String numArr[] = num.split(" ");
        for (int i = 0; i < numArr.length; i++) {
            //System.out.println(numArr[i]);
            for (int k = 0; k < arrInt.length; k++) {
                if(numArr[i]==arr[k]){
                System.out.println(arr[k]);
            }
            sum=sum*10;
            }
        }
        
    }
}
