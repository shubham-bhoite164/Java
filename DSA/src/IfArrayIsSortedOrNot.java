public class IfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5};
        System.out.println(isSoretd(arr));
    }

    static boolean isSoretd(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    return false;
                }


            }
        }
        return true;
    }
}
