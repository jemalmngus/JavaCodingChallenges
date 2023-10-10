public class CountDigit {
    static int countDigit(int n, int digit) {
        // Check if either argument is negative
        if (n < 0 || digit < 0) {
            return -1;
        }

        int count = 0;

        // Handle the special case when n is 0
        if (n == 0 && digit == 0) {
            return 1;
        }

        // Use modulo and integer division to isolate and count the digits
        while (n > 0) {
            int lastDigit = n % 10; // Get the last digit of n
            if (lastDigit == digit) {
                count++;
            }
            n /= 10; // Remove the last digit from n
        }

        return count;
    }

    public static void main(String[] args) {
        int number1 = 32121;
        int digit1 = 1;
        int result1 = countDigit(number1, digit1);
        System.out.println("Result 1: " + result1); // Should print 2

        int number2 = 33331;
        int digit2 = 3;
        int result2 = countDigit(number2, digit2);
        System.out.println("Result 2: " + result2); // Should print 4

        int number3 = 33331;
        int digit3 = 6;
        int result3 = countDigit(number3, digit3);
        System.out.println("Result 3: " + result3); // Should print 0

        int number4 = 3;
        int digit4 = 3;
        int result4 = countDigit(number4, digit4);
        System.out.println("Result 4: " + result4); // Should print 1

        int number5 = -543;
        int digit5 = 3;
        int result5 = countDigit(number5, digit5);
        System.out.println("Result 5: " + result5); // Should print -1
    }
}
