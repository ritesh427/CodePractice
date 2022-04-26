
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int cx = 0, cy = 0;
			String s = sc.next();
			char arr[] = new char[n];
			for (int j = 0; j < n; j++) {
				arr[j] = s.charAt(j);
			}
			if (x > y) {
				for (int k = 0; k < n - 1; k++) {
					if (arr[k] == '0' && arr[k + 1] == '1') {
						arr[k + 1] = '0';
						arr[k] = '1';
						cx++;
					}
				}
			} else {
				for (int k = 0; k < n - 1; k++) {
					if (arr[k] == '1' && arr[k + 1] == '0') {
						arr[k + 1] = '1';
						arr[k] = '0';
						cy++;
					}
				}
			}
			System.out.println(x * cy + y * cx);
		}
		
	}
}
