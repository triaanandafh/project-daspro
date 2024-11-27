import java.util.Scanner;
public class assignmentarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respondents = 10;
        int question = 4;

        int survey [][] = new int [respondents][question];

        for(i=0; i<respondents; i++){
            System.out.println("Respondent " + (i+1) + ": ");
            for(j=0; j < question; j++){
                System.out.print("");
            }
        }
    }
}
