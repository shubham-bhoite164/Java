import org.jetbrains.annotations.Contract;

public class BinarySearchCode {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,3,4,5,6};
        int target = 6;
        System.out.println(binarySearch(arr,target));
    }

    // Return the index
    // Return -1 if it does not exist

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            //find the middle element
            int mid = (start+end)/2;

            if (target < arr[mid]){
                // As we are searching in a left side
                end = mid-1;
            }
            else if (target>arr[mid]) {
                // As we are searching in a right side
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
