public class searchInRange {
    public static void main(String[] args) {
        // Q) Here we have to search elements in specific range from an array
        // Range = 2 to 7
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int targert = 30;
        System.out.println(range(arr,targert,2,7));
    }

    static int range(int[] arr, int target, int start,int end){

        for (int i = start; i < end ; i++) {
            if (arr[i]==target){
                return i;

            }
        }
        return -1;
    }
}
