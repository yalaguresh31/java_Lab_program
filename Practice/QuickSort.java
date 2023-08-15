
public class QuickSort {
    public void swap(int i,int j){
        int temp = i;
        i = j;
        j = temp;
    }
    public int partition(int a[],int low,int high){
      int pivot = a[low];
      int start = low;
      int end = high;
      while(start < end){
            while(a[start] <= pivot)
                start++;
            while(a[end] > pivot)
                end--;
      }//end of while
      if(start < end)
        swap(a[start],a[end]);

    swap(a[low],a[end]);

    return end;
    }//end of partition method

    public void quictSort(int a[],int low,int high){
        int k;
        if(low < high){
            k = partition(a,low,high);
            quictSort(a,low,k-1);
            quictSort(a, k+1, high);
        }
    }

    public static void main(String[] args) {
        
    }
}