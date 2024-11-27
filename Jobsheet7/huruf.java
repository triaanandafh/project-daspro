public class huruf {
    public static void main(String[] args) {
        int n = 5;
        char alphabet= 'a';
        for (int i = 1; i <= n; i++){
            // char ch = 'a';
            for(int k=1; k<=n-i;k++){
                System.out.print(" ");
            }
            for (int j=1; j <= i *2 -1; j++){
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }
}

