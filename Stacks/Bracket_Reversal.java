import java.util.Stack;

public class Bracket_Reversal {
  public static int countBracketReversals(String input) {
    Stack<Character> temp = new Stack<>();
    int il = input.length();
    if(il%2!=0){
      return -1;
    }
    int count = 0;
    for(int i=0;i<il;i++){
      char curchar = input.charAt(i);
      if(curchar=='{'){
        temp.push(curchar);
      }else{
        if(!temp.isEmpty()&&temp.peek()=='{'){
          temp.pop();
        }else{
          temp.push(curchar);
        }
      }
    }
    while(!temp.isEmpty()){
      char a = temp.pop();
      char b = temp.pop();
      if(a==b){
        count++;
      }else{
        count+=2;
      }
    }
    return count;
	}
}
