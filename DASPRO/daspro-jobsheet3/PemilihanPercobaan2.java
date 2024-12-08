import java.util.Scanner;
public class PemilihanPercobaan2 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        float total;

        System.out.println("Masukkan nilai UAS: ");
        float uas = input00.nextFloat();
        System.out.println("Masukkan nilai UTS: ");
        float uts = input00.nextFloat();
        System.out.println("Masukkan nilaikuis: ");
        float kuis = input00.nextFloat();
        System.out.println("Masukkan nilai tugas: ");
        float tugas = input00.nextFloat();

        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " +total+ " sehingga " +message);

        if (total > 80){
            System.out.println("Nilai A");
        } else if (total > 73 && total < 81){
            System.out.println("Nilai B+");
        } else if (total > 65 && total < 74){
            System.out.println("Nilai B");
        } else if (total > 60 && total < 66){
            System.out.println("Nilai C+");
        } else if (total > 50 && total < 61){
            System.out.println("Nilai C");
        } else if (total > 39 && total < 51){
            System.out.println("Nilai D");
        } else
            System.out.println("Nilai E");
        

        // switch ((int) total) {
        //     case 10:
        //     System.out.println("Nilai A");
        //     break;
        //     case total > 73 && total < 81:
        //     System.out.println("Nilai B+");
        //     break;
        //     case total > 65 && total < 74:
        //     System.out.println("Nilai B");
        //     break;
        //     case total > 60 && total < 66:
        //     System.out.println("Nilai C+");
        //     break;
        //     case total > 50 && total < 61:
        //     System.out.println("Nilai C");
        //     break;
        //     case total > 39 && total < 51:
        //     System.out.println("Nilai D");
        //     break;
        //     default:
        //     System.out.println("Nilai E");

        // }
    }
}
