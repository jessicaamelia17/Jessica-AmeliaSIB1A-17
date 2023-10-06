import java.util.Scanner;
public class PemilihanPercobaan217 {
    public static void main(String[] args){
    Scanner input17 = new Scanner(System.in);
    
    System.out.print("Nilai uas    :");
    float uas = input17.nextFloat();
    System.out.print("Nilai uts    :");
    float uts = input17.nextFloat();
    System.out.print("Nilai kuis   :");
    float kuis = input17.nextFloat();
    System.out.print("Nilai tugas  :");
    float tugas = input17.nextFloat();

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
    System.out.println("Nilai akhir = " + total); 
    String message = total < 65 ? "Remidi" : "Tidak remidi";
    System.out.println("Karena nilai akhir mendapat " + total + " sehingga " + message);
    if (total>80 && total<=100 ){
        System.out.println("Dan karena nilai akhir  mendapat " + total + " maka mendapat predikat A dan nilai setara 4 dengan kualifikasi Sangat Baik");
    } else if (total>73 && total<=80){
        System.out.println("Dan karena nilai akhir  mendapat " + total + " maka mendapat predikat B+ dan nilai setara 3,5 dengan kualifikasi Lebih dari Baik");
    } else if (total>65 && total<=73){
        System.out.println("Dan karena nilai akhir  mendapat " + total + " maka mendapat predikat B dan nilai setara 3 dengan kualifikasi Baik");
    } else if (total>60 && total<=65){
        System.out.println("Dan karena nilai akhir  mendapat " + total + " maka mendapat predikat C+ dan nilai setara 2,5 dengan kualifikasi Lebih dari Cukup");
    } else if (total>50 && total<=60){
        System.out.println("Dan karena nilai akhir  mendapat " + total + " maka mendapat predikat C dan nilai setara 2 dengan kualifikasi Cukup");
    } else if (total>39 && total<=50){
        System.out.println("Dan karena nilai akhir  mendapat " + total + " maka mendapat predikat D dan nilai setara 1 dengan kualifikasi Kurang");
    } else if (total<=39){
        System.out.println("Dan karena nilai akhir  mendapat " + total +" maka mendapat predikat E dan nilai setara 0 dengan kualifikasi Gagal");
    } 
    
    }
}

