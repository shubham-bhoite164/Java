import java.util.Arrays;
public class Arrays_2D_3 {
    public static void main(String[] args) {
        // Sort given Array
        int[] arr = new int[]{12,34,56,3,38,90,45};

        // Library to sort an array
        Arrays.sort(arr);
        System.out.println("The Sorted array is: ");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
}
