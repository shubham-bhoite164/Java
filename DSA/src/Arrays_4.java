import java.util.Scanner;

public class Arrays_4 {
    public static void main(String[] args) {
       // Find the maximum & minimum number in an array of integers without sorting them.

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the size of an array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i =0;i<size;i++){  // Taking the input to fill the array
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=1;i<size;i++){
            if (max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println("The maximum Number is "+max);
        System.out.println("The minimum Number is "+min);
    }
}
