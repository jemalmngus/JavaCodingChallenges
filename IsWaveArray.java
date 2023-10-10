public class IsWaveArray {
    static int isWave(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] % 2 == 0 && a[i + 1] % 2 == 0) || (a[i] % 2 != 0 && a[i + 1] % 2 != 0)) {
                return 0; // Two even or two odd numbers are adjacent
            }
        }
        return 1; // No two even or two odd numbers are adjacent
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 2, 9, 10, 5};
        int result1 = isWave(arr1);
        System.out.println("Result 1: " + result1); // Should print 1

        int[] arr2 = {2, 6, 3, 4};
        int result2 = isWave(arr2);
        System.out.println("Result 2: " + result2); // Should print 0

        int[] arr3 = {1, 0, 5};
        int result3 = isWave(arr3);
        System.out.println("Result 3: " + result3); // Should print 1
    }
}
