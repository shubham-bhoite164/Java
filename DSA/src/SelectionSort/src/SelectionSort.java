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



// Easy Expplanation 

class Sort  
{ 
    static void insertionSort(int arr[], int n) 
    { 
        if (n <= 1)                             //passes are done
        {
            return; 
        }

        insertionSort( arr, n-1 );        //one element sorted, sort the remaining array
       
        int last = arr[n-1];                        //last element of the array
        int j = n-2;                                //correct index of last element of the array
       
        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
        { 
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--; 
        } 
        arr[j+1] = last;                            //set the last element at its correct index
    } 

    void display(int arr[])                 //display the array
    {  
        for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
    } 
 
       
    public static void main(String[] args) 
    { 
        int arr[] = {22, 21, 11, 15, 16}; 
       
        insertionSort(arr, arr.length); 
        Sort ob = new Sort();
        ob.display(arr); 
    } 
} 
