public class Theory {
    public static void main(String[] args) {
        
        // Works only for sorted array

        // Step 1
        // Find the middle element
        // Middle element = (Start+End)/2

        // Step 2
        // Check weather the element we want is in right side of array or left side of an array.
        // As array is sorted we can easily find it.
        // if target element > middle element then search in right
        // if target element < middle element then search in left

        // Step 3
        // If Middle element then it is the Ans.

        // Step 4
        // Again divide the array and keep on dividing it until we find the required element


        // Total comparisons in worst case is log(N)
        // Where N is the size of an array
        
    }
}
