public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualThreeDecimalPlaces(-3.1756, -3.176));
    }

    public static boolean areEqualThreeDecimalPlaces(double first, double second) {
        int A = (int) (first * 1000);
        int B = (int) (second * 1000);
        if ((A - B) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
