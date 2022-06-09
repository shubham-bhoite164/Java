import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[] args) {
        // Now we have to make an array by taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int num = sc.nextInt();

        int[] marks = new int[num];
        for (int i = 0; i<num; i++){
            System.out.println(marks[i]);
        }
    }
}
