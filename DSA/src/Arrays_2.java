import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {
        // Take an array as an input from the user
        // Search for the given number X
        // And print the index of that number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();  // Taking the input from the user

        int[] num = new int[size]; // Declaring the size of an array

        // num.length is used to take the size of an array
        for (int i = 0;i< num.length;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the value which you want to find from the ");
        int x = sc.nextInt();

        for (int j=0;j< num.length;j++){
            if (num[j] == x ){
                System.out.println("Given Number found at index "+j);
            }
        }
    }
}
