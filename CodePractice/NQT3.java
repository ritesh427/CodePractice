import java.util.Scanner;
public class NQT3
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rollNum[] = new int[n];
        int marks[] = new int[n];
        for (int i = 0; i < n; i++) {
            rollNum[i] = i+1;
            marks[i] = in.nextInt();
        }
        //Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] < marks[j + 1]) {
                    int t = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = t;
                    
                    t = rollNum[j];
                    rollNum[j] = rollNum[j+1];
                    rollNum[j+1] = t;
                }
            } 
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(rollNum[i]+ " ");
        }
    }
}