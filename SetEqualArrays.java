
public class SetEqualArrays {
    static int isSetEqual(int[] a, int[] b) {
        for (int aVal : a) {
            boolean found = false;
            for (int bVal : b) {
                if (aVal == bVal) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return 0;
        }

        for (int bVal : b) {
            boolean found = false;
            for (int aVal : a) {
                if (bVal == aVal) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] array1 = { 1, 9, 12 };
        int[] array2 = { 12, 1, 9 };
        int[] array3 = { 1, 7, 8 };
        int[] array4 = { 1, 7, 1 };
        int[] array5 = { 1, 7, 6 };

        System.out.println(isSetEqual(array1, array2)); // Should return 1
        System.out.println(isSetEqual(array2, array3)); // Should return 0
        System.out.println(isSetEqual(array3, array4)); // Should return 0
        System.out.println(isSetEqual(array4, array5)); // Should return 0
    }
}
