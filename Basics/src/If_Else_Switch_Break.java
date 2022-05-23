import java.util.Scanner;

public class If_Else_Switch_Break {
    public static void main(String[] args) {


        // To check it is adult or not
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the age");
       int age = sc.nextInt();

       if (age>18){
           System.out.println("Adult");
       }
       else {
           System.out.println("Not Adult");
       }


        


        // To check if it is even or odd
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number");
       int num = sc.nextInt();

       if (num%2==0){
           System.out.println("It is an Even Number");
       }
       else {
           System.out.println("It is an Odd Number");
       }


        

        // else if
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number a: ");
       int a = sc.nextInt();
       System.out.println("Enter the number b: ");
       int b = sc.nextInt();
       if (a==b){
           System.out.println("Equal");
       }
       else if (a>b) {
           System.out.println("a is greater then b");
       }
       else {
           System.out.println("b is greater than a");
       }


        

        // Using if else
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int num1 = sc.nextInt();

       if (num1==1){
           System.out.println("English");
       }
       else if (num1==2) {
           System.out.println("Hindi");
       }
       else if (num1==3) {
           System.out.println("French");
       }
       else {
           System.out.println("invalid");
       }


        

        // Using Switch Break
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextByte();
        switch (num1){
            case 1:
                System.out.println("Engish");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("French");
                break;
            case 4:
                System.out.println("Invalid");
                break;

        }
    }
}
