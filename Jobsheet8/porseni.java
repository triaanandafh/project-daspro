import java.util.Scanner;
public class porseni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String names, sportNames, totalNames;
        int i, j,h, numPolytechnics;
        final int MAX_ATHLETES = 5;
        
        System.out.print("Enter the number of polytechnics: ");
        numPolytechnics = sc.nextInt();
        sc.nextLine();

       for (h=1; h>0; h++){
        System.out.printf("----- Polytechnic %d -----\n", h);
       
        for(i = 1; i<=4; i++){
            
            System.out.print("Input the name of sports: ");
            sportNames=sc.nextLine();
            // System.out.println();
            totalNames=" ";
            for(j=1; j<=5; j++){
                System.out.print("Name of athlete "+j+": ");
                names= sc.nextLine();
                if (j < 5) {
                    totalNames += names + ", ";
                } else {
                    totalNames += names + ".";
                }
            }
            System.out.println("Sport " + sportNames);
            System.out.println("Athletes: " + totalNames);
            
            System.out.println();
        } 
        
    }
}
}