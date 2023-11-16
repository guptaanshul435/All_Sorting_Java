package All_Sorting_Java;

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
            // outer loop is for traver all element 
            // how many time we will compare array
          for(int j=1;j<len-i;j++){
            // this inner loop is for puting greater elemnt in the last one by one
            // doing camparision
            if(arr[j-1]>arr[j]){
                // swap
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
          }
        }
    }


   public static void main(String args[]){
    // create one obect of array and intialised
    
    
   } 
}
