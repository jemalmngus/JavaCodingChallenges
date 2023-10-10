public class MinDistanceFactors {
    public static void main(String[] args) {
        int result = minDistance(13013);
        System.out.println("Smallest distance between factors: " + result);
        
        result = minDistance(8);
        System.out.println("Smallest distance between factors: " + result);
    }
    
    static int minDistance(int n) {
        int previousFactor = 1;
        int minDistance = n;
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i - previousFactor < minDistance)
                    minDistance = i - previousFactor;
                previousFactor = i;
            }
        }
        
        return minDistance;
    }
}
