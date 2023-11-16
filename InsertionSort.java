package All_Sorting_Java;

public class InsertionSort{

   public static void insertionSort(int[] arr){
   int len=arr.length;


   for(int i=0;i<len;i++){
    int key=arr[i];
    int j=i-1;
    while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
       j--;
    }
     arr[j+1]=key;

   }


   }

    public static void main(String[] args) {
        int arr[]={3,5,2,6,1};
        System.out.println("before sorting the array");
    for(int v:arr){
       System.out.print(v);
    }
    
    
    insertionSort(arr);
    System.out.println("after sorting the array\n");
    for(int v:arr)
    System.out.print(v);
    }

}