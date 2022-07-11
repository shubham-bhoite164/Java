public class linearSearch_Basics {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int target = 4; // Target element needed to be found from an array

        System.out.println(search(arr,target)); // Printing the function
    }

    static int search(int[] arr, int target){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==target){
                return i; // Returning an index of target from an array
            }
        }
        // This will return -1 if the above program won't run.
        return -1;
    }
}