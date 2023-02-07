public class postiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-15);
    }

    public static void checkNumber(int number ){
        if (number > 0){
            System.out.println("postive");
        }
        else if (number < 0){
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }

}
