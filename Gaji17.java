import java.util.Scanner;
public class Gaji17 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Deklarasi
    int jmlMasuk, JmlTdkMasuk, TotGaji;
    int gaji, potGaji;
    
    System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda\t\t: ");
    jmlMasuk=input.nextInt();
    System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda\t: ");
    JmlTdkMasuk=input.nextInt();
    System.out.print("Jumlah Gaji Anda\t\t\t\t: ");
    gaji=input.nextInt();
    System.out.print("Potongan Gaji\t\t\t\t\t: ");
    potGaji=input.nextInt();

    TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
    System.out.println("Gaji yang anda terima\t\t\t\t: " + TotGaji);





    }
    
}