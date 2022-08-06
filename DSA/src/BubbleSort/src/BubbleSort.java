import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4,5,56,4,6,3,534,5,345,34,456,5};
        bubble(arr);
        // We have to convert
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        // Here we have i to count number of traverse
        for (int i = 0; i < arr.length ; i++) {
            // Here we are using j to swap elements
            for (int j = 1; j < arr.length-i; j++) {
                // Swap if the item is smaller than previous item
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}