import java.util.Scanner;
public class arrayAverageScore21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int score []=new int[10];
        double total =0;
        double average;

        for(int i = 0; i < score.length;i++){
            System.out.print("Enter students score " + (i+1) + ": ");
            score[i]= input21.nextInt();
        }

        for (int i = 0; i < score.length; i++){
            total +=score[i];
        }

        average = total/score.length;
        System.out.println("The class average score is: " + average);
    }
}
