public class MeeraArrayChecker {
    public static int isMeera(int[] a) {
        boolean oddFlag = false;
        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
            if ((a[i] % 2 == 0 && a[j] % 2 != 0) || (a[i] % 2 != 0 && a[j] % 2 == 0))
                return 0;

            if (a[i] % 2 != 0 || a[j] % 2 != 0) {
                oddFlag = true;
                break;
            }

            i++;
            j--;
        }

        if (oddFlag)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int[] example1 = {4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6};
        int[] example2 = {2, 4, 6, 8, 6};
        int[] example3 = {2, 8, 7, 10, -4, 6};

        System.out.println(isMeera(example1)); // Output: 1 (Meera array)
        System.out.println(isMeera(example2)); // Output: 0 (not Meera array)
        System.out.println(isMeera(example3)); // Output: 0 (not Meera array)
    }
}
