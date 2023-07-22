public class Sum_Of_Digits {
  public static int sumOfDigits(int x){
    if(x<10){
      return x;
    }
    return x%10 + sumOfDigits(x/10);
  }
  public static void main(String[] args) {
    System.out.println(sumOfDigits(2345));
  }
}
