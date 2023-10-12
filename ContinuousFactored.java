public class ContinuousFactored {
    public static int isContinuousFactored(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && n % (i + 1) == 0) {
                return 1; // It's continuous factored
            }
        }
        return 0; // It's not continuous factored
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(num + " is continuous factored: " + (isContinuousFactored(num)));

        num = 60;
        System.out.println(num + " is continuous factored: " + (isContinuousFactored(num)));

        num = 120;
        System.out.println(num + " is continuous factored: " + (isContinuousFactored(num)));

        num = 90;
        System.out.println(num + " is continuous factored: " + (isContinuousFactored(num)));

        num = 99;
        System.out.println(num + " is continuous factored: " + (isContinuousFactored(num) ));

        num = 121;
        System.out.println(num + " is continuous factored: " + (isContinuousFactored(num) ));

        num = 2;
        System.out.println(num + " is continuous factored: " + (isContinuousFactored(num) ));

        num = 13;
        System.out.println(num + " is continuous factored: " + (isContinuousFactored(num) ));
    }
}
