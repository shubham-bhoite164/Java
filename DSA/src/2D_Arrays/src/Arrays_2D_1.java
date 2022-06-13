import java.util.Scanner;

public class Arrays_2D_1 {
    public static void main(String[] args) {
        
        // Declaration of 2D arrays
        // int[][] num = new int[3][5]
        // First bracket is row and second bracket is column

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int row = sc.nextInt();
        System.out.println("Enter the size of column");
        int column = sc.nextInt();

        int[][] num = new int[row][column];

        //input
        //rows
        
        for (int i = 0; i < row; i++) {
            //columns
            for (int j = 0; j < column; j++) {
                num[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }

}

