import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int arrSize=sc.nextInt();
            int c=0;
		    int arr[]= new int[arrSize];
		    for(int j=0;j<arrSize;j++){
		        arr[j]=sc.nextInt();
		    }
            for(int j=0;j<arrSize;j++){
                if(j==0)
                    if(arr[j]!=arr[j+1]) c++;
                else if(j==(arrSize-1))
                    if(arr[j]!=arr[j-1]) c++;
                else
                    if(arr[j]!=arr[j+1]||arr[j]!=arr[j=1]) c++;
            }
            System.out.println(c);
		}
		sc.close(); 
	}
}
