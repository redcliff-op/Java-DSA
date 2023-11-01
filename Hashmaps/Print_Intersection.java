import java.util.HashMap;

public class Print_Intersection {
  public static void printIntersection(int[] arr1,int[] arr2){
    HashMap<Integer,Integer> check = new HashMap<Integer,Integer>();
    for(int i=0;i<arr1.length;i++){
      if(check.containsKey(arr1[i])){
        check.put(arr1[i], check.get(arr1[i])+1);
      }else{
        check.put(arr1[i],1);
      }
    }
    for(int i=0;i<arr2.length;i++){
      if(check.containsKey(arr2[i])&&check.get(arr2[i])>0){
        System.out.println(arr2[i]);
        check.put(arr2[i], check.get(arr2[i])-1);
      }
    }
  }
}
