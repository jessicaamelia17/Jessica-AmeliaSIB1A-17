import java.util.Scanner;
public class Pemilihan2Percobaan317 {
    public static void main(String[] argas){
        Scanner input17 = new Scanner (System.in);
        //Deklarasi
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        //output
        System.out.print("Masukkan Kategoti : ");
        kategori = input17.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input17.nextInt();

        if (kategori.equals("pekerja")){
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasil Bersih : " + gajiBersih);
        }else
            System.out.println("Masukkan Kategori Salah");

    }
}

