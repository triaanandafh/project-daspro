import java.util.Scanner;
public class averageValue21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, studentScore;
        float score, totalScore, averageScore;
        i = 1;
        while(i <= 5){
            System.out.println("Input score of student " + i);
            totalScore = 0;
            for (j=1; j <=5; j++){
                
                System.out.print("Score-" + j + " = ");
                studentScore = sc.nextInt();
                totalScore += studentScore;
            }
            averageScore = totalScore /5;
            System.out.println("The average score of student "+i + " adalah = " + averageScore);
            i++;
        }
    }
}
