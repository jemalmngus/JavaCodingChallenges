import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int n = S.length();

        for (int i = 1; i <= n / 2; i++) {
            String pattern = S.substring(0, i);
            int repeats = n / i;
            StringBuilder repeated = new StringBuilder();

            for (int j = 0; j < repeats; j++) {
                repeated.append(pattern);
            }

            if (S.equals(repeated.toString())) {
                System.out.println(pattern);
                return;
            }
        }

        System.out.println(S);
    }
}
