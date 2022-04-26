import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {
            int num=sc.nextInt();
            long fact=factorial(num);
            System.out.println(fact);
        }
    }
    public static long factorial(int n)
    {
        if(n==1||n==2)
        return n;
        else
        return n*factorial(n-1);
    }
    
   
}
