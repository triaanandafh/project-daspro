import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Input number: ");
        angka = sc.nextInt();
        for(int i = 0; i < angka; i++){
            for(int j=0; j < angka; j++){
                if (i == 0 || i == angka - 1 ||j == 0 || j == angka-1){
                    System.out.print(angka +" ");
                }else{
                   
                        System.out.print("  ");
                    }
                }System.out.println();
            }
            
        }
    }

