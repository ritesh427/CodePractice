public class test {
    public static void main(String[] args){
        int a = 30,b=45;
        System.out.println("Before Swapping a="+ a +"and b = "+ b);
        swapFunctio(a,b);
        System.out.println("Before Swapping a="+ a +"and b = "+ b);
    }

    public static void swapFunction(int a,int b){
        int c= a;
        a=b;
        b=c;
    }
    
}
