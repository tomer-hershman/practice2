package lambda;

public class LambdaHelperClass {
    public static boolean isCharInString(String str, char ch) {
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
    public static double smallThePowerOfBig(double a, double b) {
        if (a < b) {
            return Math.pow(a,b);
        } else {
            return Math.pow(b,a);
        }
    }
}
