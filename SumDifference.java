public class SumDifference {
    public static int f(int[] a) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int num : a) {
            if (num % 2 == 0) {
                sumEven += num; // Add to the sum of even numbers (Y)
            } else {
                sumOdd += num; // Add to the sum of odd numbers (X)
            }
        }

        return sumOdd - sumEven; // Return the difference X - Y
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array

        int result = f(arr);
        System.out.println("Result: " + result); // Output: Result: 3
    }
}
