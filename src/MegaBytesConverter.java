public class MegaBytesConverter {
    public static void main(String[] args) {
      printMegaBytesAndkiloBytes(5000);
    }

    public static void printMegaBytesAndkiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid value");
        }
        else {
           int megaBytes = kiloBytes/1024;
           int KiloBytes = kiloBytes%1024;
           System.out.println(kiloBytes + "KB = "+ megaBytes +"MB and " + KiloBytes + "KB");
        }
    }

}