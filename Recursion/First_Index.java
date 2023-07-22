public class First_Index {
  public static int FirstIndex(int input[], int x){
    return FirstIndexHelper(input, x, 0);
  }
  public static int FirstIndexHelper(int input[], int x, int index){
    if(index==input.length){
      return -1;
    }
    if(input[index]==x){
      return index;
    }
    return FirstIndexHelper(input, x, index+1);
  }
  public static void main(String[] args){
    int temp[] = {1,2,3,4,5};
    System.out.println(FirstIndex(temp, 5));
  }
}
