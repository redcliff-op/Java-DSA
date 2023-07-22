public class Last_Index {
  public static int lastIndex(int input[],int x){
    return lastIndexHelper(input, x, input.length-1);
  }
  public static int lastIndexHelper(int input[],int x, int index){
    if(index==0){
      return -1;
    }
    if(input[index]==x){
      return index;
    }
    return lastIndexHelper(input, x, index-1);
  }
  public static void main(String[] args){
    int temp[] = {1,2,2,3,4,1,4,5,1,3};
    System.out.println(lastIndex(temp, 3));
  }
}
