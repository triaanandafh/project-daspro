import java.util.Scanner;
public class Assignment10 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        int respondent = 10, question = 6;
        int survey [][] = new int [respondent][question];
        int answer, sumRespondent, sumQuestion, totalSum;
        double averageResp, averageQuest, overallAvg;

        for(int i=0; i< respondent;i++){
            System.out.println("Respondent " + (i+1));
            for(int j=0; j<question; j++){
                System.out.println("Question "+ (j+1) + ": ");
                System.out.print("Answer for each question in range 1-5: ");
                answer = input21.nextInt();
                survey[i][j] = answer;
                
            }
           System.out.println();
        }

        System.out.println("Survey result: ");
        for(int i =0; i<respondent;i++){
            System.out.println("Respondent " + (i+1)+": ");
            for(int j=0;j<question;j++){
                System.out.print(survey [i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Average value for each respondent: ");
        for(int i = 0; i < respondent; i++){
            sumRespondent = 0;
            for(int j=0; j< question;j++){
                sumRespondent += survey[i][j];
            }
            averageResp = sumRespondent / question;
            System.out.println(averageResp);
        }
        System.out.println();

        System.out.println("Average Question: ");
        for(int j=0;j<question;j++){
            sumQuestion = 0;
            for(int i = 0; i< respondent;i++){
                sumQuestion += survey[i][j];
            }
            averageQuest = sumQuestion / respondent;
            System.out.println(averageQuest);
        }
        System.out.println();
        totalSum=0;
        for(int i=0; i<respondent;i++){
            for(int j=0;j<question;j++){
                totalSum += survey [i][j];
            }
        }
        overallAvg = (double) totalSum/(respondent*question);
        System.out.println(overallAvg);
        
    }
}
