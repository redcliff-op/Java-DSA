public class Merge_Sort {
  public static void merge(int arr[],int s, int e,int mid){
    int result[] = new int[e-s+1];
    int idx1=s;
    int idx2=mid+1;
    int x=0;
    while(idx1<=mid && idx2<=e){
      if(arr[idx1]<=arr[idx2]){
        result[x++] = arr[idx1++];
      }else{
        result[x++] = arr[idx2++];
      }
    }
    while(idx1<=mid){
      result[x++] = arr[idx1++];
    }
    while(idx2<=e){
      result[x++] = arr[idx2++];
    }
    for(int i=0,j=s;i<result.length;i++,j++){
      arr[j] = result[i];
    }
  }
  public static void mergeSort(int[] arr, int s, int e){
    if(s>=e){
      return;
    }
    int mid = (s+e)/2;
    mergeSort(arr, s, mid);
    mergeSort(arr, mid+1, e);
    merge(arr,s,e,mid);
  }
  public static void main(String[] args) {
    int test[] = {1,32,1,5,1,2,5,6,12,6,3,12,4,4,13,46,3,6,4};
    mergeSort(test, 0,test.length-1);
    for(int e:test){
      System.out.print(e+" ");
    }
  }
}
