import java.util.Scanner;
class MultipleAdd{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = 0;
		int r = 0;
		while(num > 0){
			res = num%10;
			r = res+r;
			num = num/10;
		}
		System.out.println(r);
	}
}