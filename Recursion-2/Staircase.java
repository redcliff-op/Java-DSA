public class Staircase {
  public static int staircase(int n){
    if(n==0){
      return 1;
    }
    if(n<0){
      return 0;
    }
    int j1 = staircase(n-1);
    int j2 = staircase(n-2);
    int j3 = staircase(n-3);
    return j1+j2+j3;
  }
  public static void main(String[] args) {
    System.out.println(staircase(4));
  }
}
