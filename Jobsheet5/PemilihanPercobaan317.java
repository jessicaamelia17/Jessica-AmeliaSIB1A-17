import java.util.Scanner;
public class PemilihanPercobaan317 {
    public static void main(String[] args){
    Scanner input17 = new Scanner(System.in);
    //Deklarasi
    double angka1, angka2, hasil;
    char operator;

    System.out.print("Masukkan angka pertama: ");
    angka1 = input17.nextDouble();
    System.out.print("Masukkan angka kedua: ");
    angka2 = input17.nextDouble();
    System.out.print("Masukkan operator (+ - * /):");
    operator = input17.next().charAt(0); 

    switch (operator){
        case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + "=" + hasil);
        case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + "=" + hasil);
            break;
        case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + "=" + hasil);
            break;
        case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + "=" + hasil);
            break;

    }

    }
    
}
