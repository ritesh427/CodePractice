import java.util.*;

public class MyClass {

    public static int getCountByType(Footware[] fts, String type) {
        int cnt = 0;
        for (int i = 0; i < fts.length; i++) {
            if (fts[i].getFootwareType().equalsIgnoreCase(type)) {
                cnt += 1;
            }
        }
        return cnt;
    }

    static private Comparator<Footware> dsc;
    static {
        dsc = new Comparator<Footware>() {
            public int compare(Footware f1, Footware f2) {
                if (f1.getPrice() > f2.getPrice()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
    }

    public static Footware getSecondHighestPriceByBrand(Footware[] fts, String brand) {
        Footware[] ft = new Footware[0];
        for (int i = 0; i < fts.length; i++) {
            if (fts[i].getBrandName().equalsIgnoreCase(brand)) {
                ft = Arrays.copyOf(ft, ft.length + 1);
                ft[ft.length - 1] = fts[i];
            }
        }
        if (ft.length != 0) {
            Arrays.sort(ft, dsc);
            return ft[1];
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footware[] fts = new Footware[5];
        for (int i = 0; i < 5; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String Bname = sc.nextLine();

            String type = sc.nextLine();

            int price = sc.nextInt();
            sc.nextLine();

            Footware fw = new Footware(id, Bname, type, price);
            fts[i] = fw;
        }
        String typ = sc.nextLine();
        String name = sc.nextLine();

        int cnt = getCountByType(fts, typ);
        if (cnt != 0) {
            System.out.println(cnt);
        } else {
            System.out.println("Footware not available");
        }

        Footware ftw = getSecondHighestPriceByBrand(fts, name);
        if (ftw != null) {
            System.out.println(ftw.getFootwareId());
            System.out.println(ftw.getBrandName());
            System.out.println(ftw.getPrice());
        } else {
            System.out.println("Brand not available");
        }

    }
}

class Footware {
    private String brandName;
    private String footwareType;
    private int footwareId;
    private int price;

    public Footware(int id, String name, String type, int price) {
        this.brandName = name;
        this.footwareType = type;
        this.price = price;
        this.footwareId = id;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getFootwareType() {
        return this.footwareType;
    }

    public int getPrice() {
        return this.price;
    }

    public int getFootwareId() {
        return this.footwareId;
    }
}