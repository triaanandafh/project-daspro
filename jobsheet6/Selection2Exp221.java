import java.util.Scanner;
public class Selection2Exp221 {
    public static void main(String[] args) {
        Scanner inputAbsen = new Scanner(System.in);
        int angle1, angle2, angle3, totalAngel;

        System.out.println("Input angle1 : ");
        angle1 = inputAbsen.nextInt();
        System.out.println("Input angle2 : ");
        angle2 = inputAbsen.nextInt();
        System.out.println("Input angle3 : ");
        angle3 = inputAbsen.nextInt();

        totalAngel = angle1 + angle2 + angle3;
        
        if (totalAngel == 180){
            if (angle1 == angle2 && angle1 == angle3 && angle2 == angle3){
                System.out.println("Equailateral Triangle");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3){
                System.out.println("Isoceless Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }
}
