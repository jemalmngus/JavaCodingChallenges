public class MeeraArray1 {
    static int isMeera(int[] a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            
                if (a[i]>=i) {
                    return 0; 
                }
                else{
                    sum+=a[i];
                }
            
        }
        return sum==0?1:0;
    }

  
    public static void main(String[] args) {
        int[] meeraArray1 = {-4, 0, 1, 0, 2, 1};
        int[] meeraArray2 = {-8, 0, 0, 8, 0};

        int result1 = isMeera(meeraArray1);
        int result2 = isMeera(meeraArray2);

        System.out.println("Result 1: " + result1); // Should print 1 (Meera array)
        System.out.println("Result 2: " + result2); // Should print 0 (Not a Meera array)
    }
}
