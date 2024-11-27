import java.util.Scanner;
public class studyTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studyHours, totalStudyHours=0;
        int day;

        // System.out.println("Input today's study hours: ");
        // studyHours = scanner.nextInt();
        for (day =1; day <= 7; day++){
            System.out.print("Input today's study hours: ");
            studyHours = scanner.nextInt();
            
            if(studyHours >= 10){
                System.out.println("Invalid input");
                break;
            }
            totalStudyHours += studyHours;
        } System.out.println("Total study hours for a week: " + totalStudyHours + "hours.");
    }
    
}
