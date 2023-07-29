import java.util.Arrays;

public class Triplet_Sum {
  public static int tripletSum(int[] arr, int num){
    Arrays.sort(arr);
    int ans = 0;
    for(int i=0;i<arr.length;i++){
      int s = i+1;
      int e = arr.length-1;
      while(s<e){
        int sum = arr[i]+arr[s]+arr[e];
        if(sum==num){
          ans++;
          s++;
          e--;
        }else if(sum<num){
          s++;
        }else{
          e--;
        }
      }
    }
    return ans;
	}
  public static void main(String[] args) {
    int test[] = {0,1,2,5,4,3,6};
    System.out.println(tripletSum(test, 6));
  }
}
