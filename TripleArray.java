public class TripleArray {
    static int isTriple(int[] a) {
        for (int a1 : a) {
            int count = 0;
            for (int a2 : a) {
                if (a1 == a2)
                    count++;
            }
            if (count != 3)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] meeraArray1 = { 3, 1, 2, 1, 3, 1, 3, 2, 2 };
        int[] meeraArray2 = { 2, 5, 2, 5, 5, 2, 5 };

        int result1 = isTriple(meeraArray1);
        int result2 = isTriple(meeraArray2);

        System.out.println("Result 1: " + result1); // Should print 1 (Meera array)
        System.out.println("Result 2: " + result2); // Should print 0 (Not a Meera array)
    }

}
