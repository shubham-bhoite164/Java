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
    void selectionSort(int arr[]) 
    { 
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) 
        { 
            pos = i; 
            for (int j = i+1; j < arr.length; j++) 
           {
                if (arr[j] < arr[pos])                  //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos];            //swap the current element with the minimum element
            arr[pos] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    void display(int arr[])                     //display the array
    { 
        for (int i=0; i<arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }  
    } 
  
    public static void main(String args[]) 
    { 
        Sort ob = new Sort(); 
        int arr[] = {64,25,12,22,11}; 
        ob.selectionSort(arr); 
        ob.display(arr); 
    } 
}
