import java.util.HashMap;

public class Exact_Unique_Characters {
  public static String uniqueChar(String str){
    HashMap<Character,Integer> check = new HashMap<Character,Integer>();
    StringBuilder out = new StringBuilder();
    for(int i=0;i<str.length();i++){
      if(check.containsKey(str.charAt(i))){
        continue;
      }else{
        out.append(str.charAt(i));
        check.put(str.charAt(i), 1);
      }
    }
    return out.toString();
  }
}
