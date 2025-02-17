import java.math.*;
public class MegaBytes {

	public static void main(String[] args) {
		
		printMegaBytesAndKiloBytes(2500);
		
	}  public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else{
            int Megabyte = kiloBytes / 1024;
            int remainder = Math.round(kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + Megabyte + " MB " + "and " + remainder + " KB");
        }
    }

}
/// 5000 KB = 4 MB and 904 KB
//  5000 KB = 4 MB and 904 KB