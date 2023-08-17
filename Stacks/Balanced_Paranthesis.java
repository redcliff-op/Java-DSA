import java.util.Stack;

public class Balanced_Paranthesis {
  public static boolean isBalanced(String expression) {
    Stack<Character> temp = new Stack<>();
    int stl = expression.length();
    for(int i=0;i<stl;i++){
      char curChar = expression.charAt(i);
      if(curChar=='{' || curChar=='[' || curChar=='('){
        temp.push(curChar);
      }else if(curChar=='}' || curChar==']' || curChar==')'){
        if(temp.size()==0){
          return false;
        }
        char test = temp.peek();
        if((test=='{'&&curChar=='}') || (test=='['&&curChar==']') || (test=='('&&curChar==')')){
          temp.pop();
        }else{
          return false;
        }
      }
    }
    return temp.isEmpty();
  } 
}
