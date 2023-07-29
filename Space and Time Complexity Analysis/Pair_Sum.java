import java.util.Arrays;

public class Pair_Sum {
  public static int pairSum(int[] arr, int num){
    int i=0,j=arr.length-1;
    Arrays.sort(arr);
    int ans = 0;
    while(i<j){
      int sum = arr[i]+arr[j];
      if(sum==num){
        ans++;
        i++;
        j--;
      }else if(sum<num){
        i++;
      }else{
        j--;
      }
    }
    return ans;
	}
  public static void main(String[] args) {
    int test[] = {2,3,1,5,4,10};
    System.out.println(pairSum(test, 6));
  }
}
