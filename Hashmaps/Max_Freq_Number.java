import java.util.HashMap;

public class Max_Freq_Number {
  public static int maxFrequencyNumber(int[] arr){ 
    int maxfreq = 0;
    int maxnum = Integer.MIN_VALUE;
    HashMap<Integer,Integer> check = new HashMap<Integer,Integer>();
    for(int i=0;i<arr.length;i++){
      if(!check.containsKey(arr[i])){
        check.put(arr[i], 1);
      }else{
        check.put(arr[i], check.get(arr[i])+1);
      }
    }
    for(int i=0;i<arr.length;i++){
      if(check.get(arr[i])>maxfreq){
        maxfreq = check.get(arr[i]);
        maxnum = arr[i];
      }
    }
    return maxnum;   
  }
}
