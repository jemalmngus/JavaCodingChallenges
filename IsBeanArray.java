public class IsBeanArray {
    static int isBean(int[] a) {
        boolean contains9 = false;
        boolean contains13 = false;
        boolean contains7 = false;
        boolean contains16 = false;

        for (int num : a) {
            if (num == 9) {
                contains9 = true;
            } else if (num == 13) {
                contains13 = true;
            } else if (num == 7) {
                contains7 = true;
            } else if (num == 16) {
                contains16 = true;
            }
        }

        if (contains9 && !contains13) {
            return 0;
        }

        if (contains7 && contains16) {
            return 0;
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 9, 6, 13};
        int result1 = isBean(arr1);
        System.out.println("Result 1: " + result1); // Should print 1

        int[] arr2 = {9, 6, 18};
        int result2 = isBean(arr2);
        System.out.println("Result 2: " + result2); // Should print 0

        int[] arr3 = {4, 7, 16};
        int result3 = isBean(arr3);
        System.out.println("Result 3: " + result3); // Should print 0

        int[] arr4 = {3, 4, 6, 7, 13, 15};
        int result4 = isBean(arr4);
        System.out.println("Result 4: " + result4); // Should print 1
    }
}
