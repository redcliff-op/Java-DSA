public class Multiplication {
  public static int multiplyTwoIntegers(int m, int n){
    if(n==0){
      return 0;
    }
    return m + multiplyTwoIntegers(m, n-1);
  }
  public static void main(String[] args) {
    System.out.println(multiplyTwoIntegers(5, 4));
  }
}
