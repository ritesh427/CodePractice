import java.util.*;
public class MyClass4 {
    public static void main(String[] args) throws java.lang.Exception {
        Allium[] v = new Allium[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            int AiD = sc.nextInt();
            sc.nextLine();
            String aType = sc.nextLine();
            String state = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            v[i] = new Allium(AiD, aType, state, price);

        }
        String ans1 = sc.nextLine();
        int ans2 = sc.nextInt();
        sc.close();
        Allium value1 = getstate(v, ans1);
        if (value1 == null)
            System.out.println("State not found.");
        else

            System.out.println(value1.getaType());

        Allium[] value2 = sortAllium(v, ans2);
        if (value2 == null)
            System.out.println("No Allium found.");
        else
            for (int i = 0; i < value2.length - 2; i++)
                System.out.println(value2[i].getaType() + "\n" + value2[i].getPrice());

    }

    public static Allium getstate(Allium[] arr1, String s1) {
        Allium[] count = new Allium[4];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].getState().equalsIgnoreCase(s1)) {
                count[j] = arr1[i];
                j++;
            }
        }
        if (j == 0) {
            return null;
        } else
            return count[0];
    }

    public static Allium[] sortAllium(Allium[] arr2, int s2) {
        int j = 0;
        Allium[] arr = new Allium[4];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].getPrice() < s2) {
                arr[j] = arr2[i];
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            for (int k = i + 1; k < j; k++) {
                if (arr[k].getPrice() < arr[i].getPrice()) {
                    if (arr[k] != null && arr[i] != null) {
                        Allium temp = arr[k];
                        arr[k] = arr[i];
                        arr[i] = temp;
                    }

                }
            }
        }
        if (j == 0)
            return null;

        return arr;
    }

}

class Allium {
    private int AiD, price;
    private String aType, state;

    Allium(int AiD, String aType, String state, int price) {
        this.AiD = AiD;
        this.aType = aType;
        this.state = state;
        this.price = price;

    }

    public int getAiD() {
        return AiD;
    }

    public String getaType() {
        return aType;
    }

    public String getState() {
        return state;
    }

    public int getPrice() {
        return price;
    }
}