import java.util.Scanner;
public class arrayAverageScore21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int numStudent;
        System.out.print("Enter the number of student: ");
        numStudent = input21.nextInt();

        int score []=new int[numStudent];
        double totalPassed =0, totalDidnt=0;
        double averagePassed, averageFailed;
        int numStudentPassed=0, numDidntPassed=0;

        for(int i = 0; i < score.length;i++){
            System.out.print("Enter students score " + (i+1) + ": ");
            score[i]= input21.nextInt();
        }

        for (int i = 0; i < score.length; i++){

            if(score[i] > 70){
                numStudentPassed ++;
                totalPassed += score[i];
            }
            if(score[i] <= 70){
                numDidntPassed ++;
                totalDidnt += score[i];
            }

            
        }

        averagePassed = totalPassed/numStudentPassed;
        averageFailed = totalDidnt/numDidntPassed;
        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("The average score of students who failed is "+ averageFailed);
        
    }
}
