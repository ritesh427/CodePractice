import java.util.Arrays;
public class MergeTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {10,12,23};
        int [] arr2 = {10,12,23};
        int mergeArr[] = new int[arr1.length+arr2.length];
        for (int i=0;i<arr1.length;i++){
            mergeArr[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            mergeArr[i+arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(mergeArr));
    }
    
}
