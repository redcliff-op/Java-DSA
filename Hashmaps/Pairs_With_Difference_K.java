import java.util.HashMap;

public class Pairs_With_Difference_K {
  public static int getPairsWithDifferenceK(int arr[], int k) {
    HashMap<Integer,Integer> check = new HashMap<Integer,Integer>();
    int count=0;
    for(int num: arr){
      if(check.containsKey(num)){
        check.put(num, check.get(num)+1);
      }else{
        check.put(num,1);
      }
    }
    for(int num: arr){
      if(check.containsKey(num-k)){
        count += check.get(num-k);
      }
    }
    return count;    
  }
}
