import java.util.Scanner;

public class NQT2 {
    public static void main(String[] args) {
        int itemNumber[]={101,102,103,104};
        int itemPrice[]={42,50,500,40};
        int itemStock[]={10,20,15,16};
        //String itemName[]={"Milk","Cheese","Ghee","Bread"};
        float tot;
        int qty;
        Scanner sc = new Scanner(System.in);
        int int_num = sc.nextInt();
        int int_qty = sc.nextInt();
        if(int_num>0){
            for(int i=0;i<4;i++){
                if(itemNumber[i]==int_num){
                    if(itemStock[i]>=int_qty){
                        tot = int_qty*itemPrice[i];
                        qty = itemStock[i]-int_qty;
                        System.out.println(tot+"INR");
                        System.out.println(qty+"LEFT");
                    }else{
                        System.out.println("NO STOCK");
                    }
                }else{
                    System.out.println("ITEM NOT AVILABLE");
                }
            }
        }
        sc.close();
    }
}
