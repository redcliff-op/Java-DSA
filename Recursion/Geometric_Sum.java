public class Geometric_Sum {
  public static double findGeometricSum(int k){
    if(k==0){
      return 1;
    }
    return 1/(Math.pow(2, k)) + findGeometricSum(k-1);
  }
  public static void main(String[] args) {
    System.out.println(findGeometricSum(3));
  }
}
