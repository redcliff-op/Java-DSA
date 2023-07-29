public class Array_Rotate_Check {
  public static int arrayRotateCheck(int[] arr){
    int i=0;
    boolean rotated=false;
    for(i=0;i<arr.length-1;i++){
      if(arr[i]>arr[i+1]){
        rotated=true;
        break;
      }
    }
    if(rotated==true){
      return i+1;
    }else{
      return 0;
    }
  }
  public static void main(String[] args) {
    int test[] = {10,20,30,2,3,4,5};
    System.out.println(arrayRotateCheck(test));
  }
}
