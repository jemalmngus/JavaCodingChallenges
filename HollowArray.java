public class HollowArray {
    public static int isHollow(int[] a) {
        if (a.length < 3) {
            return 0; // Array must contain at least 3 elements to be hollow
        }

        // Find the first non-zero element from the start
        int startIndex = 0;
        while (startIndex < a.length && a[startIndex] == 0) {
            startIndex++;
        }

        // Find the first non-zero element from the end
        int endIndex = a.length - 1;
        while (endIndex >= 0 && a[endIndex] == 0) {
            endIndex--;
        }

        // Check if there are 3 or more zeroes in the middle
        int zeroCount = 0;
        for (int i = startIndex; i < endIndex; i++) {
            if (a[i] == 0) {
                zeroCount++;
            }
        }

        if (zeroCount >= 3 && startIndex == endIndex - zeroCount - 1) {
            return 1; // It is a hollow array
        } else {
            return 0; // It is not a hollow array
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 0, 0, 0, 3, 4, 5};
        int[] arr2 = {1, 2, 0, 0, 0, 3, 4, 5};
        int[] arr3 = {1, 2, 4, 9, 0, 0, 0, 3, 4, 5};
        int[] arr4 = {1, 2, 0, 0, 3, 4};

        System.out.println(isHollow(arr1)); // Should print 1
        System.out.println(isHollow(arr2)); // Should print 0
        System.out.println(isHollow(arr3)); // Should print 0
        System.out.println(isHollow(arr4)); // Should print 0
    }
}
