import java.util.Scanner;

public class Arrays_3 {
    public static void main(String[] args) {
        // Take an array of names as input from the user and print them on the screen.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of names");
        int size = sc.nextInt();

        String[] names = new String[size];

        for (int i=0;i<size;i++){
            names[i] = sc.next();
        }

        for (int i=0;i<size;i++){
            System.out.println(names[i]);
        }

    }
}
