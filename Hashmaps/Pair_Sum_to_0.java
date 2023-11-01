import java.util.HashMap;

public class Pair_Sum_to_0 {
  public static int PairSum(int[] arr, int size) {
    HashMap<Integer,Integer> check = new HashMap<Integer,Integer>();
    for(int i=0;i<size;i++){
      if(check.containsKey(arr[i])){
        check.put(arr[i], check.get(arr[i])+1);
      }else{
        check.put(arr[i],1);
      }
    }
    int count=0;
    for(int i=0;i<size;i++){
      if(check.containsKey(-arr[i])){
        count += check.get(-arr[i]);
      }
      if(arr[i]==0){
        count--;
      }
    }
    return count/2;
	}
}
