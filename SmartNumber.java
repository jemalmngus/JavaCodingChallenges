public class SmartNumber {

    public static int isSmart(int n) {
        int current = 1;  // The first element in the sequence
        int k = 1;        // The position of the current element

        // Check if n is the first element
        if (n == current) {
            return 1;
        }

        // Iterate through the sequence to find if n is a Smart number
        while (n > current) {
            k++;            // Increment position
            current += (k - 1);  // Calculate the next element
            if (current == n) {
                return 1;  // n is a Smart number
            }
        }

        // If n is not in the sequence, it's not a Smart number
        return 0;
    }

    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;
        int num3 = 8;

        System.out.println("isSmart(" + num1 + ") returns " + isSmart(num1));  // Should return 1
        System.out.println("isSmart(" + num2 + ") returns " + isSmart(num2));  // Should return 1
        System.out.println("isSmart(" + num3 + ") returns " + isSmart(num3));  // Should return 0
    }
}
