import java.util.Scanner;

public class Questions_10_2 {
    // Write a function to print the sum of all odd numbers from 1 to 100
    public static int sumOfOddNum(int n){
        int sum = 0;
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the NUmber till which you want the sum of odd numbers");
        int n = sc.nextInt();
        sumOfOddNum(n);

    }
}
