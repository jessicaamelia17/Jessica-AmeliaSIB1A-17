import java.util.Scanner;
public class HargaBayar17 {
    public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    //Deklarasi
     int harga, jumlah, jmlHlmBuku;
     double dis, total, bayar, jmlDis;
     String merkBuku; 
     //Output
     System.out.print("Masukkan harga barang yang dibeli\t: ");
     harga=input.nextInt();
     System.out.print("Masukkan Jumlah barang yang dibeli\t: ");
     jumlah=input.nextInt();
     System.out.print("Merk Buku\t\t\t\t: ");
     merkBuku=input.next();
     System.out.print("Jumlah Halaman Buku\t\t\t: ");
     jmlHlmBuku=input.nextInt();
     System.out.print("Diskon\t\t\t\t\t: ");
     dis=input.nextDouble();

     total=harga*jumlah;
     jmlDis=total*dis;
     bayar=total-jmlDis;

     System.out.println("Diskon yang anda dapatkan\t\t: " +jmlDis);
     System.out.println("Jumlah yang harus dibayar\t\t: " +bayar);
     


    }
 
    
}

