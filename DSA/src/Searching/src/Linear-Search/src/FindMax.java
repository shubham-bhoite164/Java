public class FindMax {
    public static void main(String[] args) {
        // Finding Maximum element from the array
        int[] arr = {1,2,3,4,5,97,110,-234,45};
        System.out.println(min(arr));
    }




    static int min(int[] arr){
        int ans = arr[0];  // Declaring an array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>ans){
                ans = arr[i]; // Putting the smallest element in the variable ans
            }
        }
        return ans;
    }
}
