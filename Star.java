import java.util.Scanner;
public class Star {

    public static void main(String[] args) {
        int row,col,star;
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of star: ");
        star = sc.nextInt();
        
        for (row = 1; row<=star; ++row) {
            for (col = 1; col <= row; ++col) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        System.out.println("---------------------------------------------");
                    
        for (row = star; row >= 1; --row) {
            for (col = 1; col <= row; ++col) {
                System.out.print("*");
            }
 
            System.out.println();
        }
        System.out.println("---------------------------------------------");
        
        int midRow = (star);
        
        for (int i = midRow; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }

            System.out.println();

            row++;
        }

        for (int i = 0; i <= midRow; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = row; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();

            row--;
        }
        
    }
    
}