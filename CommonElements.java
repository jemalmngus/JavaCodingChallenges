public class CommonElements {

    public static int[] findCommonElements(int[] first, int[] second) {
        // Check if either of the input arrays is null, return null in that case
        if (first == null || second == null) {
            return null;
        }
        
        // Check if either of the input arrays is empty, return an empty array in that case
        if (first.length == 0 || second.length == 0) {
            return new int[0];
        }

        // Determine the minimum length of the two input arrays
        int min = (first.length < second.length) ? first.length : second.length;
        int[] a, b;

        // Assign the smaller array to 'a' and the larger array to 'b'
        if (min == first.length) {
            a = first;
            b = second;
        } else {
            a = second;
            b = first;
        }

        // Create an array 'c' to store common elements, initialized with zeros
        int[] c = new int[min];
        int k = 0; // Index for 'c'

        // Iterate through 'a' and 'b' to find common elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    // Found a common element, add it to 'c' and increment 'k'
                    c[k] = a[i];
                    k++;
                }
            }
        }

        // Create a result array of the exact size needed to store common elements
        int[] retArray = new int[k];

        // Copy the common elements from 'c' to 'retArray'
        for (int t = 0; t < retArray.length; t++) {
            retArray[t] = c[t];
        }

        return retArray; // Return the array containing common elements
    }

    // Main method for testing the function
 

    public static void main(String[] args) {
        int[] first1 = {1, 8, 3, 2};
        int[] second1 = {4, 2, 6, 1};
        System.out.println(findCommonElements(first1, second1)); // Output: [1, 2]

        int[] first2 = {1, 8, 3, 2, 6};
        int[] second2 = {2, 6, 1};
        System.out.println(findCommonElements(first2, second2)); // Output: [2, 6, 1]

        int[] first3 = {1, 3, 7, 9};
        int[] second3 = {7, 1, 9, 3};
        System.out.println(findCommonElements(first3, second3)); // Output: [1, 3, 7, 9]

        int[] first4 = {1, 2};
        int[] second4 = {3, 4};
        System.out.println(findCommonElements(first4, second4)); // Output: []

        int[] first5 = {};
        int[] second5 = {1, 2, 3};
        System.out.println(findCommonElements(first5, second5)); // Output: []

        int[] first6 = {1, 2};
        int[] second6 = {};
        System.out.println(findCommonElements(first6, second6)); // Output: []

        int[] first7 = {1, 2};
        int[] second7 = null;
        System.out.println(findCommonElements(first7, second7)); // Output: null

        int[] first8 = null;
        int[] second8 = {};
        System.out.println(findCommonElements(first8, second8)); // Output: null

        int[] first9 = null;
        int[] second9 = null;
        System.out.println(findCommonElements(first9, second9)); // Output: null
    }
}
