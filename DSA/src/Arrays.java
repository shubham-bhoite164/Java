import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int[] marks; // That's how we declare the array
        marks = new int[3];

        marks[0]=97; // Putting the number in specific indexes
        marks[1]=98;
        marks[2]=96;

        // long Method to print array

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Easy method to print array
        for (int i = 0;i<3;i++){
            System.out.println(marks[i]);

        }
        

        // Another Method to Declare the Array
        int[] num = {10,20,30};

        for (int j=0; j<3; j++){
            System.out.println(num[j]);
        }

    }
}
