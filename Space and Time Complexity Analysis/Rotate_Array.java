public class Rotate_Array {
  public static void rotate(int[] arr, int d) {
    int result[] = new int[arr.length];
    int k = 0;
    for(int i=0;i<arr.length-d;i++,k++){
      result[k]=arr[i+d]; 
    }
    for(int i=0;i<d;i++,k++){
      result[k] = arr[i];
    }
    for(int i=0;i<arr.length;i++){
      arr[i] = result[i];
    }
  }
  public static void main(String[] args) {
    int test[] = {1,2,3,4,5,6,7};
    rotate(test, 2);
    for(int e:test){
      System.out.print(e+" ");
    }
  }
}
