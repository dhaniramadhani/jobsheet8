import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int i=0;
        

        System.out.println("Masukan Nilai N= ");
        n = s.nextInt();

        while (i<=n) {
            int j= 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
           System.out.println();
            i++;
        }
    }
    
}
    

