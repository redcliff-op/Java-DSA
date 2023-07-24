public class Quick_Sort {
  public static int sort(int arr[], int s, int e){
    int count=0;
    int piv = arr[s];
    int pivIndex;
    for(int i=s+1;i<=e;i++){
      if(arr[i]<=piv){
        count++;
      }
    }
    
    pivIndex = count+s;
    int temp;
    temp = arr[pivIndex];
    arr[pivIndex] = arr[s];
    arr[s] = temp;

    int i=s,j=e;
    while(i<pivIndex && j>pivIndex){
      if(arr[i]<=piv){
        i++;
      }
      else if(arr[j]>piv){
        j--;
      }
      else{
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    return pivIndex;
  }
  public static void quickSort(int input[],int s, int e) {
		if(s>=e){
      return;
    }
    int pivIndex = sort(input, s, e);
    quickSort(input,s,pivIndex-1);
    quickSort(input,pivIndex+1,e);
    
	}
  public static void main(String[] args) {
    int temp[] = {5,2,1,6,7,1,3,6,3,1};
    quickSort(temp, 0, temp.length-1);
    for(int e:temp){
      System.out.print(e+" ");
    }
  }
}
