import java.lang.reflect.Array;
import java.util.*;

class Main{
  
   public static void reverse(int[] arr , int start , int end){
         if(start >= end) return;
         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;
         reverse(arr, start+ 1, end - 1);

      }
      
   public static void main(String[] args) {
   //   System.out.println("cool");
   // reverse a array
   int arr[] = {2,4,1,6,5};

    // bubble sort
    for(int i = 0; i < arr.length - 1; i++){
        for(int j = 0; j < arr.length - i - 1; j++){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

   // selection sort
    for(int i = 0; i < arr.length -1; i++){
        int smallest = i;
        for(int j = i + 1; j < arr.length; j++){
            if(arr[smallest] > arr[j]){
                smallest = j;
            }
        }

        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }

    // insertion sort

    for(int i = 1; i < arr.length; i++){
        int curr = arr[i];
        int j = i - 1;

        while(j >= 0 && curr < arr[j]){
            arr[j + 1] = arr[j];
            j--;
        }

        // placement

        arr[j + 1] = curr;
    }
     



    System.out.print(Arrays.toString(arr));


   }
}
