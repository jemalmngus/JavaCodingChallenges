public class MeeraArray {
    static int isMeera(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int n = a[i];
            for (int j = 0; j < a.length; j++) {
                if (a[j] == 2 * n) {
                    return 0; // 2*n is in the array, not a Meera array
                }
            }
        }
        return 1; // It's a Meera array
    }

  
    public static void main(String[] args) {
        int[] meeraArray1 = {3, 5, -2};
        int[] meeraArray2 = {8, 3, 4};

        int result1 = isMeera(meeraArray1);
        int result2 = isMeera(meeraArray2);

        System.out.println("Result 1: " + result1); // Should print 1 (Meera array)
        System.out.println("Result 2: " + result2); // Should print 0 (Not a Meera array)
    }
}
