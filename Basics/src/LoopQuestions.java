import java.util.Scanner;

public class LoopQuestions {
    public static void main(String[] args) {

        // Sum of First 4 natural numbers using for loop
        int i = 0;
        int sum = 0;
        for (i=0;i<5;i++){
            sum = i + sum;
        }
        System.out.println(sum);



         // Sum of First 4 natural numbers using While loop
        while (i<5){
            i++;
            sum = sum + i;
        }
        System.out.println(sum);



        // Table of a given digit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the table");
        int i = sc.nextInt();
        int a = 0;
        while (a<10){
            a++;
            System.out.println(i*a);

        }



        // Factorial Value Question
        int i = 1;
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the factorial");
        int num = sc.nextInt();

        while (i<=num){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);



        // Print all even numbers till 100
        int i =0;
        for (i=0;i<111;i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }



        
//        Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
//        If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
//        If they enter 0 then stop.
//        If he/ she scores :
//        Marks >=90 -> print “This is Good”
//        89 >= Marks >= 60 -> print “This is also Good”
//        59 >= Marks >= 0 -> print “This is Good as well”
//        Because marks don’t matter but our effort does.

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice 1/0 ");
        int choice = sc.nextInt();

        
        if (choice==1){
            System.out.println("Enter the marks ");
            int marks = sc.nextInt();
            if (marks>=90){
                System.out.println("This is Good");
            } else if (89>=marks && marks>=60 ) {
                System.out.println("This is also Good");
            } else if (59>=marks && marks>=0) {
                System.out.println("This is Good as well");
            }
        }
        else if (choice==0){
            System.out.println("Program Finished");
        }
        else {
            System.out.println("Please choose between 1/0");
        }

    }
}
