import java.util.Scanner;
public class Pemilihan2Percobaan217 {
    public static void main(String[] args){
        Scanner input17 = new Scanner (System.in);
        //Deklarasi
        float sudut1, sudut2, sudut3, totalSudut ;

        //output
        System.out.print("Masukkan sudut 1 = ");
        sudut1 = input17.nextFloat();
        System.out.print("Masukkan sudut 2 = ");
        sudut2 = input17.nextFloat();
        System.out.print("Masukkan sudut 3 = ");
        sudut3 = input17.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if(totalSudut == 180){
            if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.print("Segitiga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == 60) && (sudut2 ==60) && (sudut3 == 60) )
                System.out.print("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1<90)==(sudut2<90)==(sudut3<90))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else if ((sudut1<180) == (sudut2<180) == (sudut3<180))
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        }else
        System.out.println("Bukan Segitiga");
    }
}

