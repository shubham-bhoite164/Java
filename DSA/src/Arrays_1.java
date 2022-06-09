import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[] args) {
        
        // Now we have to make an array by taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int num = sc.nextInt();
        int[] marks = new int[num];
        
        // In this for loop we are adding the values in the Array
        for (int i=0;i<num;i++){
            marks[i] = sc.nextInt();
        }
        // In this we are giving Output
        for (int i = 0; i<num; i++){
            System.out.println(marks[i]);
        }
    }
}
