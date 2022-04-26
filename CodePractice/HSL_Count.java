import java.util.Scanner;
class HSL_Count{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	String color = sc.nextLine();
	System.out.println(Solution(color));
	}
	
	static int Solution(String color){
		int result = 0;
		int hCount = 0;
		int lCount = 0;
		//int i;
		int len = color.length();
		for(int i = 0; i < len; i++){
			if(color.charAt(i)=='L')
				lCount++;
			//System.out.println(lCount);
		}
		for(int i = 0; i < len; i++){
			if(color.charAt(i)=='L')
				lCount--;
			if(color.charAt(i)=='H')
				hCount++;
			if(color.charAt(i)=='S')
				result = lCount * hCount;
		}
		return result;
	}
	
}