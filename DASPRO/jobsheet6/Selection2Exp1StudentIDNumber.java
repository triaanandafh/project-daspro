import java.util.Scanner;
public class Selection2Exp1StudentIDNumber {
    public static void main(String[] args) {
        Scanner inputStudentIDNumber = new Scanner(System.in);
        int year;

        System.out.println("Input year : ");
        year = inputStudentIDNumber.nextInt();

        if(year%4 == 0){
            if(year%100 != 0 ){
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }else {
            System.out.println("Not a leap year");
        }
}
}


// if (year % 4 == 0){
//     if(year % 100 == 0){
//         if(year%400 == 0){
//         System.out.println("Leap year");
//         }else{System.out.println("Not a leap year");}       
// }else{System.out.println("leap year");}

// }else{System.out.println("Not a leap year");}