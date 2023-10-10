public class HollowArray {
    static int isHollow(int[] a) {
        if (a.length < 3) {
            return 0; // Array must have at least 3 elements to be considered hollow
        }
    
        int start = -1; // Index of the first non-zero element from the start
        int end = -1;   // Index of the first non-zero element from the end
        int zeroCount = 0; // Count of zeroes encountered
        
        // Find the first non-zero element from the start
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
            break;    
            }
            start=i;
        }
    
        // Find the first non-zero element from the end
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 0) {
                break;
            }
            end=i;
        }
    
        // Check if there are no non-zero elements, or only one zero in the middle
        if (start >= end || start == -1 || end == -1) {
            return 0; // Not a hollow array
        }
    
        // Count zeroes in the middle
        for (int i = start; i <= end; i++) {
            if (a[i] == 0) {
                zeroCount++;
            }
        }
      
    
        // Check if there are at least 3 zeroes in the middle
        if (zeroCount >= 3 && zeroCount==a.length-end && zeroCount==start+1) {
            return 1; // It is a hollow array
        }
    
        return 0; // Not a hollow array
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





// static int isHollow(int[] a) {
//     // Check if the array length is less than 3, which cannot be hollow
//     if (a.length < 3) {
//         return 0; // Not a hollow array
//     }
    
//     int zeroCount = 0; // Count of zeroes encountered

//     // Use two pointers approach, one starting from the beginning, and the other from the end
//     for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
//         // Check if there is a non-zero element on one side and a zero on the other side
//         if ((a[i] == 0 && a[j] != 0) || (a[i] != 0 && a[j] == 0)) {
//             return 0; // Not a hollow array
//         }

//         // Check for a single zero in the middle
//         if (i == j && a[i] == 0) {
//             zeroCount++;
//         } else {
//             // Count zeroes on both sides
//             if (a[i] == 0) zeroCount++;
//             if (a[j] == 0) zeroCount++;
//         }

//         // Check for a single zero surrounded by non-zero elements
//         if (a[i] == 0 && (i + 1 < a.length && a[i + 1] != 0)) {
//             return 0; // Not a hollow array
//         }
//     }

//     // Check if there are at least 3 zeroes in the middle
//     if (zeroCount >= 3) {
//         return 1; // It is a hollow array
//     } else {
//         return 0; // Not a hollow array
//     }
// }
