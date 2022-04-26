import java.util.*;
public class cipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String planeText = sc.nextLine();
        int key = sc.nextInt();
        if(key>0){
        for(int i=0;i<planeText.length();i++){
            int ascii = planeText.charAt(i);
            if (ascii == 32){
                ascii = ascii + 0;
            }else{
            ascii = ascii + key;
            }
             String newText =  Character.toString(ascii);
             System.out.print(newText);         
        }
        sc.close();
    }else{
        System.out.println("INVALID INPUT");
    }
    }
}