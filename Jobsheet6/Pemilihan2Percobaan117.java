import java.util.Scanner;
public class Pemilihan2Percobaan117{
    public static void main(String[] args){
    Scanner input17 = new Scanner (System.in);
    //Deklarasi
    int tahun ;

    //output
    System.out.print("Masukkan Tahun : ");
    tahun = input17.nextInt();

    if ((tahun % 4) == 0){
        if((tahun % 100 == 0) )
            if(((tahun % 400 == 0)))
            System.out.println("Tahun Kabisat");
            else {
            System.out.println("Bukan Tahun Kabisat");
            }
        else {
            System.out.println("BUkan Tahun Kabisat");
        }
    }else {
        System.out.println("Bukan Tahun Kabisat");
    }
    }
}