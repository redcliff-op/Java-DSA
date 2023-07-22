public class Check_Sorted {
  public static boolean isSorted(int input[]){
    return isSortedHelper(input, 0);
  }
  public static boolean isSortedHelper(int input[], int index){
    if(index==input.length-1){
      return true;
    }
    if(input[index]>input[index+1]){
      return false;
    }
    return isSortedHelper(input, index+1);
  }
  public static void main(String[] args){
    int temp[] = {3,2,3,4,5};
    System.out.println(isSorted(temp));
  }
}
