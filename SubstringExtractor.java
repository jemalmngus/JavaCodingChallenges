public class SubstringExtractor {
    public static char[] f(char[] a, int start, int len) {
        // Check if the start position and length are legal
        if (start < 0 || start >= a.length || len < 0 || start + len > a.length) {
            return null; // Return null for illegal values
        }

        char[] result = new char[len]; // Initialize the result character array

        // Copy characters from the input array to the result array
        for (int i = 0; i < len; i++) {
            result[i] = a[start + i];
        }

        return result; // Return the extracted substring
    }

    public static void main(String[] args) {
        char[] input = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        int start = 6; // Start position
        int length = 5; // Length

        char[] result = f(input, start, length);

        if (result != null) {
            System.out.println(new String(result)); // Output: "World"
        } else {
            System.out.println("Invalid start or length.");
        }
    }
}
