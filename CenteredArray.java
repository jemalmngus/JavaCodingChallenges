public class CenteredArray {
    public static int isCentered(int[] arr) {
        // Check if the array length is odd
        if (arr.length % 2 == 0) {
            return 0; // Not centered
        }

        int middleIndex = arr.length / 2;
        int middleValue = arr[middleIndex];

        // Check if all elements except the middle one are greater than the middle value
        for (int i = 0; i < arr.length; i++) {
            if (i != middleIndex && arr[i] <= middleValue) {
                return 0; // Not centered
            }
        }

        return 1; // Centered
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; // Centered
        int[] arr2 = {3, 2, 1, 4, 5}; // Not centered

        System.out.println(isCentered(arr1)); // Output: 1
        System.out.println(isCentered(arr2)); // Output: 0
    }
}
