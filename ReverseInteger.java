public class ReverseInteger {

    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 4321;
        int num3 = 12005;
        int num4 = 50021;
        int num5 = 1;
        int num6 = 1000;
        int num7 = 0;
        int num8 = -12345;

        int reversed1 = a4(num1);
        int reversed2 = a4(num2);
        int reversed3 = a4(num3);
        int reversed4 = a4(num4);
        int reversed5 = a4(num5);
        int reversed6 = a4(num6);
        int reversed7 = a4(num7);
        int reversed8 = a4(num8);

        System.out.println("Reversed 1234: " + reversed1);      // Output: 4321
        System.out.println("Reversed 4321: " + reversed2);      // Output: 1234
        System.out.println("Reversed 12005: " + reversed3);    // Output: 50021
        System.out.println("Reversed 50021: " + reversed4);    // Output: 12005
        System.out.println("Reversed 1: " + reversed5);        // Output: 1
        System.out.println("Reversed 1000: " + reversed6);     // Output: 1
        System.out.println("Reversed 0: " + reversed7);        // Output: 0
        System.out.println("Reversed -12345: " + reversed8);   // Output: -54321
    }

    static int a4(int n) {
        int sign = 1;
        if (n == 0) return 0;
        if (n < 0) {
            sign = -1;
            n = -n;
        }
        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
        }
        return sign * reverse;
    }
}
