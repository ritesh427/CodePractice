import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        String input = "";
        for (int i = 0; i < testCases; i++) {
            input = br.readLine();
            System.out.println(blackAndWhiteMatrix(Integer.parseInt(input.split(" ")[0]),Integer.parseInt(input.split(" ")[1]), br));
        }
    }

    private static int blackAndWhiteMatrix(int n, int m, BufferedReader br) throws Exception {
        boolean isBlack = false;
        int count = 0;
        int tempCount = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            tempCount = 0;
            for (int j = 0; j < m; j++) {
                if (s.indexOf('#') != -1) {
                    if (s.charAt(j) == '#' && isBlack) {
                        tempCount++;
                    } else if (s.charAt(j) == '#') {
                        isBlack = true;
                        tempCount++;
                    }
                }
            }
            count = tempCount > count ? tempCount : count;
        }
        return count;
    }
}