import java.util.Arrays;

public class Find_Duplicate {
  public static int findDuplicate(int[] arr){
    Arrays.sort(arr);
    int i;
    for(i=0;i<arr.length-1;i++){
      if(arr[i]==arr[i+1]){
        break;
      }
    }
    return arr[i];
  }  
  public static void main(String[] args) {
    int test[] = {1,2,3,4,5,6,7,4,8,9,10};
    System.out.println(findDuplicate(test));
  }
}
