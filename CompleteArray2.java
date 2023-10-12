public class CompleteArray2 {

    public static int isComplete(int[] a) {
        boolean evenFlag = false;
        int maximumEven = 0;

        for (int num : a) {
            if (num < 0) {
                return 0;
            }
            if (num % 2 == 0) {
                evenFlag = true;
                if (num > maximumEven) {
                    maximumEven = num;
                }
            }
        }

        if (!evenFlag) {
            return 0;
        }

        for (int i = 2; i < maximumEven; i += 2) {
            boolean flag = false;
            for (int num : a) {
                if (num == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return 0;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 2, 4, 11, 6, 10, 9, 8};
        int[] arr2 = {2, 3, 3, 6};
        int[] arr3 = {2, -3, 4, 3, 6};

        System.out.println("isComplete(arr1) returns " + isComplete(arr1));  // Should return 1
        System.out.println("isComplete(arr2) returns " + isComplete(arr2));  // Should return 0
        System.out.println("isComplete(arr3) returns " + isComplete(arr3));  // Should return 0
    }
}
