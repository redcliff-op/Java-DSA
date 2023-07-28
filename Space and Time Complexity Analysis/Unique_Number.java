import java.util.Arrays;

public class Unique_Number{
  public static int findUnique(int[] arr) {
    Arrays.sort(arr);
    int i;
    for(i=0;i<arr.length-1;i+=2){
      if(arr[i]!=arr[i+1]){
        break;
      }
    }
    return arr[i];
	}  
  public static void main(String[] args) {
    int test[] = {1,2,2,1,4,5,4,5,6,6,7,8,7,8,9};
    System.out.println(findUnique(test));
  }
}
