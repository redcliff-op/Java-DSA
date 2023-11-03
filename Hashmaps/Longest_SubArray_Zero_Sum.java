import java.util.HashMap;

public class Longest_SubArray_Zero_Sum {
  public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
    int max = 0;
    int sum = 0;
    HashMap<Integer,Integer> check = new HashMap<Integer,Integer>();
    for(int i=0;i<arr.length;i++){
      sum += arr[i];
      if(sum==0){
        int len = i+1;
        if(len>max){
          max = len;
        }
      }
      if(check.containsKey(sum)){
        int len = i-check.get(sum);
        if(len>max){
          max = len;
        }
      }else{
        check.put(sum, i);
      }
      
    }
    return max;
  }
}
