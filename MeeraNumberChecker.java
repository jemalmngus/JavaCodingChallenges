public class MeeraNumberChecker {
    public static int isMeera(int n) {
        int nontrivialFactorsCount = 0;
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                nontrivialFactorsCount++;
            }
        }
        
        if (nontrivialFactorsCount > 0 && n % nontrivialFactorsCount == 0) {
            return 1; // Meera number
        } else {
            return 0; // Not a Meera number
        }
    }

    public static void main(String[] args) {
        System.out.println(isMeera(6));   // Output: 1 (6 is a Meera number)
        System.out.println(isMeera(30));  // Output: 1 (30 is a Meera number)
        System.out.println(isMeera(21));  // Output: 0 (21 is not a Meera number)
    }
}
