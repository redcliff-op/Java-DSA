public class Count_Zeros {
  public static int countZerosRec(int x){
    if(x==0){
      return 1;
    }
    if(x<10){
      return 0;
    }
    if(x%10==0){
      return 1 + countZerosRec(x/10);
    }
    return countZerosRec(x/10);
  }
  public static void main(String[] args) {
    int x = 12140001;
    System.out.println(countZerosRec(x));
  }
}
