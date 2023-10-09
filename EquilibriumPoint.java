public class EquilibriumPoint {

    public static int findEquilibriumPoint(int[] arr) {
        int n = arr.length;

        // Calculate the total sum of all elements in the array
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            // Calculate the right sum by subtracting the left sum and current element from
            // the total sum
            int rightSum = totalSum - leftSum - arr[i];

            // Check if the left and right sums are equal
            if (leftSum == rightSum) {
                return i; // Found the equilibrium point
            }

            // Update the left sum for the next iteration
            leftSum += arr[i];
        }

        // If no equilibrium point is found, return -1
        return -1;
    }

    static int a6(int[] a) {
        if (a.length < 3)
            return -1;
        int i = 0;
        int j = a.length - 1;
        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];
        for (int k = 1; k < a.length - 2; k++) {
            if (leftSum < rightSum) {
                i++;
                leftSum += a[i];
                idx = i + 1;
            } else {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 8, 3, 7, 10, 2 };
        int result1 = findEquilibriumPoint(arr1);
        System.out.println("Equilibrium Point for arr1: " + result1); // Output: 3

        int[] arr2 = { 1, 5, 3, 1, 1, 1, 1, 1, 1 };
        int result2 = findEquilibriumPoint(arr2);
        System.out.println("Equilibrium Point for arr2: " + result2); // Output: 2

        int[] arr3 = { 2, 1, 1, 1, 2, 1, 7 };
        int result3 = findEquilibriumPoint(arr3);
        System.out.println("Equilibrium Point for arr3: " + result3); // Output: 5

        int[] arr4 = { 1, 2, 3 };
        int result4 = findEquilibriumPoint(arr4);
        System.out.println("Equilibrium Point for arr4: " + result4); // Output: -1

        int[] arr5 = { 3, 4, 5, 10 };
        int result5 = findEquilibriumPoint(arr5);
        System.out.println("Equilibrium Point for arr5: " + result5); // Output: -1

        int[] arr6 = { 1, 2, 10, 3, 4 };
        int result6 = findEquilibriumPoint(arr6);
        System.out.println("Equilibrium Point for arr6: " + result6); // Output: -1
    }
}
