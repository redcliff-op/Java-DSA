import java.util.ArrayList;
import java.util.List;

public class Return_Keypad {
  public static ArrayList keypadHelper(String str){
    if(str.length()==0){
      ArrayList<String> base = new ArrayList<>(List.of(""));
      return base;
    }
    char ch = str.charAt(0);
    String combo[] = {".",";","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    ArrayList<String> recans = keypadHelper(str.substring(1));
    ArrayList<String> myans = new ArrayList<>();
    for(int i=0;i<combo[ch-48].length();i++){
      char temp = combo[ch-48].charAt(i);
      for(String rec: recans){
        myans.add(temp + rec);
      }
    }
    return myans;
  }
  public static String[] keypad(int n){
    ArrayList<String> temp = keypadHelper(String.valueOf(n));
    String result[] = new String[temp.size()];
    for(int i=0;i<temp.size();i++){
      result[i] = temp.get(i);
    }
    return result;
	}
  public static void main(String[] args) {
    String result[] = keypad(798231134);
    for(String s: result){
      System.out.println(s);
    }
  }
}
