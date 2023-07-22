public class Find_Number {
  public static boolean checkNumber(int input[],int x){
    return checkNumberHelper(input, x, 0);
  }
  public static boolean checkNumberHelper(int input[],int x, int index){
    if(index==input.length){
      return false;
    }
    if(input[index]==x){
      return true;
    }
    return checkNumberHelper(input, x, index+1);
    
  }
  public static void main(String[] args){
    int temp[] = {1,2,3,4,5};
    System.out.println(checkNumber(temp, 2));
  }
}