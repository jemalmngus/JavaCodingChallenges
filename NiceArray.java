public class NiceArray {
    static int isNice(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i] + 1 || a[j] == a[i] - 1) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] niceArray1 = {2, 10, 9, 3};
        int[] niceArray2 = {2, 2, 3, 3, 3};
        int[] notNiceArray = {3, 4, 5, 7};

        int result1 = isNice(niceArray1);
        int result2 = isNice(niceArray2);
        int result3 = isNice(notNiceArray);

        System.out.println("Result 1: " + result1); // Should print 1 (Nice array)
        System.out.println("Result 2: " + result2); // Should print 1 (Nice array)
        System.out.println("Result 3: " + result3); // Should print 0 (Not a Nice array)
    }
}
