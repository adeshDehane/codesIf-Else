public class SpeedConvertor {
    public static void main(String[] args) {
        System.out.println("return "+ toMilesPerHour(-5.6) );
        printConversion(10.25);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid number");
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

   public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour+ "km/h=" + milesPerHour + "mi/h");
        }
   }
}
