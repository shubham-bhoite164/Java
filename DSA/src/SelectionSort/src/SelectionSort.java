import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {3,4,23,423,423,434,5456,456,0,-12,23,24};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            // Find the max item in the array and swap with the correct index
            int last = arr.length-i-1;
            int max = getMaxindex(arr,0,last);

            swap(arr,max,last);
        }
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxindex(int arr[],int start,int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

}