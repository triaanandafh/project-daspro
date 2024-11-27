import java.util.Scanner;
public class Cinema21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String[][] audience = new String[4][2];
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";

        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        for (String[] rowAudience : audience){
            System.out.println("Length of row: " + rowAudience.length);
        }

        for (int i = 0; i< audience.length; i++){
            System.out.println("Audience in the row " + (i+1) + ": "+ String.join(", ", audience[i]));
        }
    }
    
}




// System.out.println(audience[0].length);
// System.out.println(audience[1].length);
// System.out.println(audience[2].length);
// System.out.println(audience[3].length);

      

       

        // System.out.println(audience.length);
        // for(int i=0; i < audience.length; i++){
        //     System.out.println("Length of row "+ (i+1)+ ": "+ audience[i].length);
        // }
