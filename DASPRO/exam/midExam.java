import java.util.Scanner;
public class midExam {
    public static void main(String[] args) {
        Scanner inputscore = new Scanner(System.in);
        int potentialTest, englishTest, nationalismTest;
        double averageTestScore, ipkScore;
        String healthCertificate;


        System.out.println("Input Potential test score: ");
        potentialTest = inputscore.nextInt();
        System.out.println("Input English test score: ");
        englishTest = inputscore.nextInt();
        System.out.println("Input Nationalism test score: ");
        nationalismTest = inputscore.nextInt(); 

        averageTestScore = (potentialTest + englishTest + nationalismTest) / 3;

        System.out.println("The average score is " + averageTestScore);

        if(averageTestScore >= 78 && potentialTest!=78 && englishTest!= 78 && nationalismTest != 78){
            System.out.println("You can continue the selection");
            System.out.println("Input IPK score: ");
            ipkScore = inputscore.nextDouble();
            System.out.println("Have you input the physical health? (yes/no)");
            healthCertificate = inputscore.next();

        

        if (healthCertificate.equalsIgnoreCase("yes")){
            if(ipkScore >= 3.25){
                System.out.println("You passed the selection");
            }else{
                System.out.println("You didnt pass the selection");
            }
        }else {
            System.out.println("You have to submit the health certificate");
        }

    }else{
        System.out.println("You cannot continue the selection");
    }

        
        
    }
    

}