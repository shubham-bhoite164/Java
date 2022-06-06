import java.util.Scanner;

public class Questions_10_5 {
    // Write a program to enter the numbers till the user wants and at the end
    // it should display the count of positive, negative and zeros entered.
    public static void main(String[] args) {
        int positive = 0 , negative = 0 , zeros = 0;

        Scanner sc = new Scanner(System.in);
        int input;
        while(true) {
            System.out.println("Put 1 to continue and 0 to stop");
            input = sc.nextInt();
            if (input == 0) {
                System.out.println("Thanks, Now Program will stop");
                break;
            } else if (input == 1) {
                System.out.println("Enter the number");
                Scanner num = new Scanner(System.in);
                int number = num.nextInt();

                if (number > 0) {
                    positive++;
                    System.out.println("Total positive digits are " + positive);
                } else if (number < 0) {
                    negative++;
                    System.out.println("Total negatives digits are " + negative);
                } else {
                    zeros++;
                    System.out.println("Total zeros are " + zeros);
                }
            }
        }

    }
}
