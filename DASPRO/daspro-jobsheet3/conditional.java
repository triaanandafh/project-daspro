// import java.util.Scanner;
import java.util.Scanner; 
// _sc

public class conditional {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        int angka;
        
        System.out.println("Masukkan angka: ");
        angka = input00.nextInt();
        if (angka % 2 == 0)
        System.out.println("Angka " +angka+ " adalah bilangan genap.");
        else
        System.out.println("Angka " +angka+ " adalah bilangan ganjil.");

        
    }
}
