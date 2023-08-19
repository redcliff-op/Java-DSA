import java.util.Stack;

public class Stock_Span {
  public static int[] stockSpan(int[] price) {
    int ss[] = new int[price.length];
    ss[0]=1;
    int pl = price.length;
    Stack<Integer> span = new Stack<>();
    span.push(0);
    for(int i=1;i<pl;i++){
      while(span.size()>0 && price[i]>price[span.peek()]){
        span.pop();
      }
      if(span.size()==0){
        ss[i] = i+1;
      }else{
        ss[i] = i-span.peek();
      }
      span.push(i);
    }
    return ss;
	}
}
