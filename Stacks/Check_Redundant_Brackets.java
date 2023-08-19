import java.util.Stack;

public class Check_Redundant_Brackets {
  public static boolean checkRedundantBrackets(String expression) {
    Stack<Character> temp = new Stack<Character>();
    int stl = expression.length();
    int count = 0;
    for (int i = 0; i < stl; i++) {
      char curchar = expression.charAt(i);
      if (curchar != ')') {
        temp.push(curchar);
      }
      count = 0;
      if(curchar==')'){
        if (temp.peek() == '(') {
          return true;
        }
        while(temp.peek()!='('){
          temp.pop();
          count++;
        }
        temp.pop();
        count--;
      }
    }
    return count==0;
  }
}
