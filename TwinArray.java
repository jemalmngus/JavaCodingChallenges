public class TwinArray {
    static int isTwin(int[] a) {
        boolean twinPrimeFlag;
        for (int a1 : a) {
            twinPrimeFlag = true;
            if (isPrime(a1) && (isPrime(a1 - 2) || isPrime(a1 + 2))) {
                twinPrimeFlag = false;
                for (int a2 : a) {
                    if (isPrime(a1 - 2) && a2 == a1 - 2) {
                        twinPrimeFlag = true;
                        break;
                    }
                    if (isPrime(a1 + 2) && a2 == a1 + 2) {
                        twinPrimeFlag = true;
                        break;
                    }
                }
            }
            if (!twinPrimeFlag)
                return 0;
        }
        return 1;
    }
    

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 8, 10, 27};
        int[] arr2 = {11, 9, 12, 13, 23};
        int[] arr3 = {5, 3, 14, 7, 18, 67};
        int[] arr4 = {13, 14, 15, 3, 5};
        int[] arr5 = {1, 17, 8, 25, 67};

        System.out.println(isTwin(arr1)); // Should return 1
        System.out.println(isTwin(arr2)); // Should return 1
        System.out.println(isTwin(arr3)); // Should return 1
        System.out.println(isTwin(arr4)); // Should return 0
        System.out.println(isTwin(arr5)); // Should return 0
    }
}
